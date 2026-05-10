package com.WasteWisteRoutes.dtos.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthResponseDTO {
    private String token;
    private String tipo = "Bearer";
    private String correo;
    private List<String> roles;
}