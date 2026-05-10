package com.WasteWisteRoutes.serviceImpl.security;

import com.WasteWisteRoutes.dtos.security.AuthRequestDTO;
import com.WasteWisteRoutes.dtos.security.AuthResponseDTO;
import com.WasteWisteRoutes.Repositories.UsuarioRepository;
import com.WasteWisteRoutes.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl {

    @Autowired private AuthenticationManager authManager;
    @Autowired private UsuarioRepository usuarioRepo;
    @Autowired private JwtUtil jwtUtil;

    public AuthResponseDTO login(AuthRequestDTO request) {
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getCorreo(), request.getPassword())
        );

        var usuario = usuarioRepo.buscarPorCorreo(request.getCorreo()).orElseThrow();

        String token = jwtUtil.generateToken(usuario.getCorreo());

        AuthResponseDTO response = new AuthResponseDTO();
        response.setToken(token);
        response.setCorreo(usuario.getCorreo());
        return response;
    }
}
