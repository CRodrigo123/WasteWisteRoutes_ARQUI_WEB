package com.WasteWisteRoutes.services;

import com.WasteWisteRoutes.Entitys.Reporte;
import com.WasteWisteRoutes.Entitys.Ruta;
import com.WasteWisteRoutes.Entitys.RutaDetalle;
import com.WasteWisteRoutes.Entitys.Ubicacion;
import com.WasteWisteRoutes.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class RutaService {

    @Autowired
    private RutaRepository rutaRepository;
    @Autowired
    private RutaDetalleRepository rutaDetalleRepository;

    public Ruta programarRuta(Ruta ruta) {
        return rutaRepository.save(ruta);
    }

    public List<RutaDetalle> obtenerSecuenciaDeRecoleccion(Long rutaId) {
        return rutaDetalleRepository.obtenerSecuenciaRuta(rutaId);
    }

    @Transactional
    public void asignarPuntoARuta(Ruta ruta, Ubicacion ubicacion, Integer orden) {
        RutaDetalle detalle = new RutaDetalle();
        detalle.setRuta(ruta);
        detalle.setUbicacion(ubicacion);
        detalle.setOrden(orden);
        rutaDetalleRepository.save(detalle);
    }
    public List<Ruta> listarTodas() {
        return rutaRepository.findAll();
    }

    public void eliminarRuta(Long id) {
        rutaRepository.deleteById(id);
    }
}
