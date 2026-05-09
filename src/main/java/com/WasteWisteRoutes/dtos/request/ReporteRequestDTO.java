package com.WasteWisteRoutes.dtos.request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReporteRequestDTO {
    private String descripcion;
    private Long usuarioId;
    private Long empresaId;
    private Double latitud;
    private Double longitud;
    private String direccion;
    private String urlFoto;
}
