package com.WasteWisteRoutes.services;

import com.WasteWisteRoutes.Entitys.*;
import com.WasteWisteRoutes.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario registrarUsuario(Usuario usuario) {
        usuario.setFechaRegistro(LocalDateTime.now());
        return usuarioRepository.save(usuario);
    }

    public Usuario validarLogin(String correo, String password) {
        return usuarioRepository.buscarPorCorreo(correo)
                .filter(u -> u.getPassword().equals(password))
                .orElse(null);
    }
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public void eliminar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
