package com.WasteWisteRoutes.services;

import com.WasteWisteRoutes.Entitys.*;
import com.WasteWisteRoutes.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class NotificacionService {

    @Autowired
    private NotificacionRepository notificacionRepository;

    public void enviarAlerta(Usuario usuario, String mensaje) {
        Notificacion noti = new Notificacion();
        noti.setUsuario(usuario);
        noti.setMensaje(mensaje);
        noti.setLeido(false);
        noti.setFecha(LocalDateTime.now());
        notificacionRepository.save(noti);
    }
}
