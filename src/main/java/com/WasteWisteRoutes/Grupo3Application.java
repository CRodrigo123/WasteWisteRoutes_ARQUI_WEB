package com.WasteWisteRoutes; // El paquete debe ser este

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Grupo3Application {

    public static void main(String[] args) {
        // Aquí estaba el error, ya lo corregimos quitando "utils."
        SpringApplication.run(Grupo3Application.class, args);
    }

}