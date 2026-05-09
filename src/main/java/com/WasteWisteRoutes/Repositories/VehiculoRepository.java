package com.WasteWisteRoutes.Repositories;

import com.WasteWisteRoutes.Entitys.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
    @Query("SELECT v FROM Vehiculo v WHERE v.empresa.id = :empresaId")
    List<Vehiculo> buscarPorEmpresa(@Param("empresaId") Long empresaId);
}
