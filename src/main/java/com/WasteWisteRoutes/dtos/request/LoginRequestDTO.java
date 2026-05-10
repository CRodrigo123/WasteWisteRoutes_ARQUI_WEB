package com.WasteWisteRoutes.dtos.request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginRequestDTO {
    private String correo;
    private String password;
}
