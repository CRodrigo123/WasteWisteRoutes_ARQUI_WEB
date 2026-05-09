package com.WasteWisteRoutes.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reporte_estadistico")
public class ReporteEstadistico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_inicio")
    private java.time.LocalDate fechaInicio;

    @Column(name = "fecha_fin")
    private java.time.LocalDate fechaFin;

    @Column(name = "total_reportes")
    private Integer totalReportes;

    @Column(name = "ahorro_combustible")
    private Double ahorroCombustible;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
}