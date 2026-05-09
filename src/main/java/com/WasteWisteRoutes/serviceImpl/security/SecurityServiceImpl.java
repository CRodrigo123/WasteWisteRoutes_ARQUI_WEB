package com.WasteWisteRoutes.serviceImpl.security;
import com.WasteWisteRoutes.Entitys.Usuario;
import com.WasteWisteRoutes.Repositories.UsuarioRepository;
import com.WasteWisteRoutes.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl {

    @Autowired private UsuarioRepository usuarioRepo;
    @Autowired private PasswordEncoder passwordEncoder;

    public void actualizarPassword(Long usuarioId, String nuevaPassword) {
        Usuario usuario = usuarioRepo.findById(usuarioId).orElseThrow();
        usuario.setPassword(passwordEncoder.encode(nuevaPassword));
        usuarioRepo.save(usuario);
    }

    public boolean esPropietarioDelReporte(Long usuarioId, Long reporteId) {
        return true;
    }
}
