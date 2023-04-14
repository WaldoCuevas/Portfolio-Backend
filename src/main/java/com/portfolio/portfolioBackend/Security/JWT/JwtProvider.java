package com.portfolio.portfolioBackend.Security.JWT;

import com.portfolio.portfolioBackend.Security.Models.UsuarioPrincipal;

import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;


@Component
public class JwtProvider {
    
    private final static Logger logger = LoggerFactory.getLogger(JwtProvider.class);

    private static final String SECRET_KEY = "5468576D5A7134743777397A24432646294A404E635266556A586E3272357538";

    @Value("${jwt.expiration}")
    private int expiration;

    //Genera el token
    public String generateToken(Authentication authentication){

        UsuarioPrincipal usuarioPrincipal = (UsuarioPrincipal) authentication.getPrincipal();
        return Jwts.builder().setSubject(usuarioPrincipal.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + expiration * 1000))
                .signWith(getSecret())
                .compact();
    }


    public String getNombreUsuarioFromToken(String token){
        return Jwts.parserBuilder().setSigningKey(getSecret()).build().
        parseClaimsJws(token).getBody().getSubject();
    }

    public boolean validateToken(String token){
        try {
            Jwts.parserBuilder().setSigningKey(getSecret()).build().parseClaimsJws(token);
            return true;
        }catch (MalformedJwtException e){
            logger.error("token mal formado");
        }catch (UnsupportedJwtException e){
            logger.error("token no soportado");
        }catch (ExpiredJwtException e){
            logger.error("token expirado");
        }catch (IllegalArgumentException e){
            logger.error("token vacío");
        }catch (SignatureException e) {
            logger.error("fail en la firma");
        }

        return false;
    }

    private Key getSecret(){
        byte[] secretBytes = Decoders.BASE64URL.decode(SECRET_KEY);
        //secretBytes = Keys.secretKeyFor(SignatureAlgorithm.HS512).getEncoded();
        return Keys.hmacShaKeyFor(secretBytes);
    }
    

}
