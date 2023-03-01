package com.portfolio.portfolioBackend.User.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDTO {
    
    private String user_name;

    private String user_password;

}
