package com.WasteWisteRoutes.dtos.qry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UbicacionCriticaQRY {
    private Double latitud;
    private Double longitud;
    private String direccion;
    private Long cantidadReportes;
}