package com.WasteWisteRoutes.dtos.responses;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RutaResumenDTO {
    private Long rutaId;
    private String placaVehiculo;
    private String nombreEmpresa;
    private Integer totalParadas;
    private List<String> puntosDeRecoleccion;
}
