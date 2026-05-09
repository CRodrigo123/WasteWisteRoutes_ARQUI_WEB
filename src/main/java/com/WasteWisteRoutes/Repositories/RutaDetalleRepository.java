package com.WasteWisteRoutes.Repositories;

import com.WasteWisteRoutes.Entitys.RutaDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RutaDetalleRepository extends JpaRepository<RutaDetalle, Long> {

    @Query("SELECT rd FROM RutaDetalle rd WHERE rd.ruta.id = :idRuta ORDER BY rd.orden ASC")
    List<RutaDetalle> obtenerSecuenciaRuta(@Param("idRuta") Long idRuta);
}