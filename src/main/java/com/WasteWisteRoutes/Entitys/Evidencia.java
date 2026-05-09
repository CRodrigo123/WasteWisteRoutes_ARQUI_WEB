package com.WasteWisteRoutes.Entitys;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "evidencia")
@Getter
@Setter
public class Evidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "url_imagen", columnDefinition = "TEXT")
    private String urlImagen;

    @ManyToOne
    @JoinColumn(name = "reporte_id")
    private Reporte reporte;

}
