package com.WasteWisteRoutes.dtos.qry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FiltroReporteQRY {
    private String estado;      // Pendiente, En Proceso, Finalizado
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String distrito;
    private Long empresaId;
}
