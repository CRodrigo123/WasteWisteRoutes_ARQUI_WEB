package com.WasteWisteRoutes.services;

import com.WasteWisteRoutes.Entitys.Evidencia;
import com.WasteWisteRoutes.Entitys.Reporte;
import com.WasteWisteRoutes.Entitys.Ubicacion;
import com.WasteWisteRoutes.Repositories.EvidenciaRepository;
import com.WasteWisteRoutes.Repositories.ReporteRepository;
import com.WasteWisteRoutes.Repositories.UbicacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReporteService {

    @Autowired
    private ReporteRepository reporteRepository;
    @Autowired
    private UbicacionRepository ubicacionRepository;
    @Autowired
    private EvidenciaRepository evidenciaRepository;

    @Transactional
    public Reporte crearReporteCompleto(Reporte reporte, Ubicacion ubicacion, String urlFoto) {
        Ubicacion nuevaUbicacion = ubicacionRepository.save(ubicacion);

        reporte.setUbicacion(nuevaUbicacion);
        reporte.setFecha(LocalDateTime.now());
        reporte.setEstado("Pendiente");
        Reporte reporteGuardado = reporteRepository.save(reporte);

        if (urlFoto != null && !urlFoto.isEmpty()) {
            Evidencia evidencia = new Evidencia();
            evidencia.setUrlImagen(urlFoto);
            evidencia.setReporte(reporteGuardado);
            evidenciaRepository.save(evidencia);
        }

        return reporteGuardado;
    }

    public List<Reporte> obtenerReportesPorEmpresaYEstado(Long empresaId, String estado) {
        return reporteRepository.buscarPorEmpresaYEstado(empresaId, estado);
    }
}

