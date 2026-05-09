package com.WasteWisteRoutes.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReporteResponseDTO {
    private Long id;
    private String descripcion;
    private String estado;
    private LocalDateTime fecha;
    private String nombreUsuario;
    private String direccionUbicacion;
    private String urlEvidencia;
}
