package com.WasteWisteRoutes.controllers;

import com.WasteWisteRoutes.Entitys.Ruta;
import com.WasteWisteRoutes.Entitys.RutaDetalle;
import com.WasteWisteRoutes.services.RutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/rutas")
public class RutaController {

    @Autowired
    private RutaService rutaService;

    @PostMapping("/crear")
    public ResponseEntity<Ruta> crearRuta(@RequestBody Ruta ruta) {
        return ResponseEntity.ok(rutaService.programarRuta(ruta));
    }

    @GetMapping("/{rutaId}/secuencia")
    public List<RutaDetalle> verSecuencia(@PathVariable Long rutaId) {
        return rutaService.obtenerSecuenciaDeRecoleccion(rutaId);
    }

    @GetMapping
    public List<Ruta> listarRutas() {
        return rutaService.listarTodas();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarRuta(@PathVariable Long id) {
        rutaService.eliminarRuta(id);
        return ResponseEntity.noContent().build();
    }
}