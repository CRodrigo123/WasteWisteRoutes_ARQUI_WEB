package com.WasteWisteRoutes.controllers;

import com.WasteWisteRoutes.Entitys.Ruta;
import com.WasteWisteRoutes.Entitys.RutaDetalle;
import com.WasteWisteRoutes.Entitys.Usuario;
import com.WasteWisteRoutes.services.RutaService;
import com.WasteWisteRoutes.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registro")
    public ResponseEntity<Usuario> registrar(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.registrarUsuario(usuario));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String correo, @RequestParam String password) {
        Usuario user = usuarioService.validarLogin(correo, password);
        if (user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.status(401).body("Credenciales incorrectas");
    }
    @GetMapping
    public List<Usuario> listarTodos() {
        return usuarioService.listarUsuarios();
    }

    // Para eliminar (Evidencia de gestión)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
