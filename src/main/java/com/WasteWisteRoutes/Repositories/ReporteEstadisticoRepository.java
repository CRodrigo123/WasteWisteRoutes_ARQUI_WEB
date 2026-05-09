package com.WasteWisteRoutes.Repositories;

import com.WasteWisteRoutes.Entitys.ReporteEstadistico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReporteEstadisticoRepository extends JpaRepository<ReporteEstadistico, Long> {

    @Query("SELECT re FROM ReporteEstadistico re WHERE re.empresa.id = :empresaId AND re.fechaInicio >= :fecha")
    List<ReporteEstadistico> obtenerReportesRecientes(@Param("empresaId") Long empresaId, @Param("fecha") java.time.LocalDate fecha);
}
