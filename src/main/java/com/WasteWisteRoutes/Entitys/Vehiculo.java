package com.WasteWisteRoutes.Entitys;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String placa;

    private Double capacidad;

    @Column(length = 20)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
}