package com.WasteWisteRoutes.Repositories;

import com.WasteWisteRoutes.Entitys.Notificacion;
import com.WasteWisteRoutes.Repositories.NotificacionRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {

}
