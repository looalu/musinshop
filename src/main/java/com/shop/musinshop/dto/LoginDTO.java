package com.shop.musinshop.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginDTO {
    private String username;
    private String password;

}