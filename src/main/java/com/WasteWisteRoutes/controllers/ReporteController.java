package com.WasteWisteRoutes.controllers;
import com.WasteWisteRoutes.Entitys.Reporte;
import com.WasteWisteRoutes.Entitys.Ubicacion;
import com.WasteWisteRoutes.Repositories.UbicacionRepository;
import com.WasteWisteRoutes.services.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reportes")
public class ReporteController {

    @Autowired
    private ReporteService reporteService;
    /*@PostMapping("/registrar")
    public ResponseEntity<Reporte> crearReporte(
            @RequestBody Reporte reporte,
            @RequestParam Ubicacion ubicacion,
            @RequestParam(required = false) String urlFoto) {
        Reporte nuevoReporte = reporteService.crearReporteCompleto(reporte, ubicacion, urlFoto);
        return ResponseEntity.ok(nuevoReporte);
    } */
    /*@PostMapping("/registrar")
    public ResponseEntity<Reporte> crearReporte(
            @RequestBody Reporte reporte,
            @RequestParam(required = false) String urlFoto) {

        // Sacamos la ubicación del cuerpo del JSON que mandamos en Postman
        Ubicacion ubicacion = reporte.getUbicacion();
        Reporte nuevoReporte = reporteService.crearReporteCompleto(reporte, ubicacion, urlFoto);
        return ResponseEntity.ok(nuevoReporte);
    } */
    @PostMapping("/registrar")
    public ResponseEntity<Reporte> crearReporte(
            @RequestBody Reporte reporte,
            @RequestParam(required = false) String urlFoto) {

        // Al enviar el JSON como está en tu foto de Postman,
        // reporte.getUbicacion() ya traerá los datos.
        Reporte nuevoReporte = reporteService.crearReporteCompleto(reporte, reporte.getUbicacion(), urlFoto);
        return ResponseEntity.ok(nuevoReporte);
    }
    @GetMapping("/empresa/{empresaId}/pendientes")
    public List<Reporte> listarPendientes(@PathVariable Long empresaId) {
        return reporteService.obtenerReportesPorEmpresaYEstado(empresaId, "Pendiente");
    }
}