package com.WasteWisteRoutes.Entitys;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ruta_detalles")
@Getter
@Setter
public class RutaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer orden;

    @ManyToOne
    @JoinColumn(name = "ruta_id")
    private Ruta ruta;

    @ManyToOne
    @JoinColumn(name = "ubicacion_id")
    private Ubicacion ubicacion;



}
