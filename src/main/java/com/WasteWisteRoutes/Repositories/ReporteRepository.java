package com.WasteWisteRoutes.Repositories;

import com.WasteWisteRoutes.Entitys.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReporteRepository extends JpaRepository<Reporte, Long> {

    // Consulta personalizada para obtener reportes pendientes de una empresa específica
    @Query("SELECT r FROM Reporte r WHERE r.empresa.id = :empresaId AND r.estado = :estado")
    List<Reporte> buscarPorEmpresaYEstado(@Param("empresaId") Long empresaId, @Param("estado") String estado);
}