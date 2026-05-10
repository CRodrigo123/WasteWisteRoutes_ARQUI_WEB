package com.WasteWisteRoutes.Repositories;

import com.WasteWisteRoutes.Entitys.Empresa; // Asegúrate de que apunte a tu entidad Empresa
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}