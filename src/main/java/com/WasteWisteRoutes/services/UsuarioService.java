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
        // Aquí se agregaría la lógica de cifrado de password si fuera necesario
        return usuarioRepository.save(usuario);
    }

    public Usuario validarLogin(String correo, String password) {
        return usuarioRepository.buscarPorCorreo(correo)
                .filter(u -> u.getPassword().equals(password)) // Simplificado para el ejemplo
                .orElse(null);
    }
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll(); // Esto usa el JpaRepository para traer a todos
    }

    public void eliminar(Long id) {
        usuarioRepository.deleteById(id); // Esto borra al usuario por su ID
    }
}