package com.WasteWisteRoutes.dtos.qry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@Data
@AllArgsConstructor
public class ReporteEficienciaQRY {
    private String nombreEmpresa;
    private String placaVehiculo;
    private Double ahorroCombustible;
    private Integer reportesAtendidos;
    private Double kmRecorridos;
}