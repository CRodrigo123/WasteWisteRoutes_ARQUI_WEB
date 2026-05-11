package com.WasteWisteRoutes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
                WasteWiseRoutes API funcionando.

                Endpoints:
                GET  /api/v1/rutas
                POST /api/v1/rutas/crear

                GET  /api/usuarios
                POST /api/usuarios/registro
                POST /api/usuarios/login

                POST /api/reportes/registrar
                """;
    }
}