package com.portfolio.portfolioBackend.Security.Controllers;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.portfolio.portfolioBackend.Security.DTO.JwtDTO;
import com.portfolio.portfolioBackend.Security.DTO.LoginUsuario;
import com.portfolio.portfolioBackend.Security.DTO.NuevoUsuario;
import com.portfolio.portfolioBackend.Security.Enums.RolNombre;
import com.portfolio.portfolioBackend.Security.JWT.JwtProvider;
import com.portfolio.portfolioBackend.Security.Models.Rol;
import com.portfolio.portfolioBackend.Security.Models.Usuario;
import com.portfolio.portfolioBackend.Security.Service.RolService;
import com.portfolio.portfolioBackend.Security.Service.UsuarioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200/")
public class AuthController {
    
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    RolService rolService;

    @Autowired
    JwtProvider jwtProvider;

    @GetMapping("/HolaMundo")
    public String HolaMundo() {
        return "Hola Mundo";
    }

    // CREATE usuario
    @PostMapping("/nuevo")
    public ResponseEntity<?> nuevo(@Valid @RequestBody NuevoUsuario nuevoUsuario) {

        // 1.creamos un usuario con los datos que nos envia el cliente.
        Usuario usuario = new Usuario(nuevoUsuario.getNombre(), nuevoUsuario.getApellido(), nuevoUsuario.getEmail(),
                nuevoUsuario.getNombreUsuario(),
                passwordEncoder.encode(nuevoUsuario.getPassword()));

        /*
         * 2. creamos un set y agregamos el rol de USER. (importante -> el set contiene
         * solo el rol de USER)
         * 2. si en los del cliente. contiene el rol de ADMIN, tambien lo
         * agregamos a la lista de Roles. (Importante -> Ahora el set contiene USER Y
         * ADMIN).
         */

          
        Set<Rol> roles = new HashSet<>();
        roles.add(rolService.getByRolNombre(RolNombre.ROLE_USER).get());
        if (nuevoUsuario.getRoles().contains("admin"))
        roles.add(rolService.getByRolNombre(RolNombre.ROLE_ADMIN).get());

        /*
         * 4. una vez terminada esa verificación, le agregamos/seteamos la lista de
         * Roles al usuario del cliente.
         * 5. Lo guardamos en la base de datos.
         * 6. y retornamos un mensaje 201 - CREATED.
        */
        usuario.setRoles(roles);
        usuarioService.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);

    }

    // LOGIN usuario
    @PostMapping("/login")
    public ResponseEntity<JwtDTO> login(@Valid @RequestBody LoginUsuario loginUsuario) {

        /*
         * Para realizar el login, lo primero es obtener las credenciales del cliente
         * y crear un objeto de Tipo Authentication
         */
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginUsuario.getNombreUsuario(), loginUsuario.getPassword()));

        /*
         * con las credenciales en el objeto Authentication, usamos unos metodos de Security que necesitan
         * de parametro un objeto Authentication para validar esa authentication con credenciales.
         */

        SecurityContextHolder.getContext().setAuthentication(authentication);

        /*
         * y ya, con esa authentificacion validada, generamos un token (es importante entender que
         * estamos con los datos del cliente, es decir que el authentication nunca sera el mismo,
         * por ende, el token tampoco. siempre se generara uno nuevo).
         */
        String jwt = jwtProvider.generateToken(authentication);

        /*
         * Mediante la authentication obtenemos unos ultimos datos del cliente
         * para realizar un ultimo paso.
         */
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        /*
         * DTO - Objeto de transferencia de datos - Data Transfer Object
         * Aqui es importante revisar la siguiente clase: JwtDTO.
         * esta clase contiene los siguiente valores: token, Bearer, nombreUsuario y
         * authorities;
         * Y es lo que permite realizar lo siguiente: Authorization Bearer
         * 
         * ---------------------------------Concepto----------------------------------------
         * 
         * Authorization Bearer es un tipo de modelos estándar de autorización OAuth
         * 2.0, que es “Bearer”. Un formato que nos permite la autorización en conjunto con
         * la autenticación de usuarios. Este es el esquema que está más de moda hoy en día
         * 
         * ------------------------------Fin del Concepto------------------------------------
         * 
         * JWT = Token
         * userDetails.getUsername() = usuario;
         * userDetails.getAuthorities() = autenticación
         */

        JwtDTO jwtDto = new JwtDTO(jwt, userDetails.getUsername(), userDetails.getAuthorities());

        return ResponseEntity.status(HttpStatus.OK).body(jwtDto);
    }

}
