package com.WasteWisteRoutes.Entitys;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jspecify.annotations.Nullable;

import java.time.LocalDateTime;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String nombre;

    @Column(length = 150, unique = true)
    private String correo;

    @Column(length = 255)
    private String password;

    @Column(length = 20)
    private String tipo;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    @Column(length = 20)

    private String rol;


}