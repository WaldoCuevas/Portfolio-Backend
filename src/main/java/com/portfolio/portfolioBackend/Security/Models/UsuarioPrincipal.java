package com.portfolio.portfolioBackend.Security.Models;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioPrincipal implements UserDetails{

    private String nombre;

    private String apellido;

    private String email;

    private String nombreUsuario;

    private String password;

     /**
     * De aqui en adelante. todo complicado de explicar
     * 1. crear una coleccion de Authoridades. (Linea 50)
     * 2. Crear un constructor con todas las propiedad (linea 25)
     * 3. Crear un metodo Build() -> (linea 52)
     * Bien. para resumir. este método lo que hace es revisar si el usuario es un administrador o un user.
     * Primera parte: crea una lista de authorities. revisara cual es el rol del usuario. y lo guarda en esa lista.
     * Segunda parte: creara un nuevo usuario principal pasando como ultimo parametro el "authorities".
    */

    private Collection<? extends GrantedAuthority> authorities;

    public static UsuarioPrincipal build(Usuario usuario) {
        List<GrantedAuthority> authorities = usuario.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol
                .getRolNombre().name())).collect(Collectors.toList());

        return new UsuarioPrincipal(usuario.getNombre(), usuario.getApellido(), usuario.getEmail(),
         usuario.getNombreUsuario(), usuario.getPassword(), authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return nombreUsuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

 
    
}
