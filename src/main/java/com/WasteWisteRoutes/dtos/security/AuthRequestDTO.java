package com.WasteWisteRoutes.dtos.security;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthRequestDTO {
    private String correo;
    private String password;
}