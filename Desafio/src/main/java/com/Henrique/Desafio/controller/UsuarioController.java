package com.Henrique.Desafio.controller;

import com.Henrique.Desafio.Usuarios.Usuarios;
import com.Henrique.Desafio.Usuarios.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuariosRepository repository;

    // Método GET para retornar todos os usuários
    @GetMapping
    public List<Usuarios> getAll() {
        return repository.findAll();
    }

    // Método POST para criar um novo usuário
    @PostMapping
    public ResponseEntity<Usuarios> createUsuario(@RequestBody Usuarios usuario) {
        Usuarios newUsuario = repository.save(usuario);
        return new ResponseEntity<>(newUsuario, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Usuarios> getUsuarioById(@PathVariable Long id) {
        return repository.findById(id)
                .map(usuario -> ResponseEntity.ok(usuario))
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/cpf/{cpf}")
    public ResponseEntity<Usuarios> getUsuarioByCpf(@PathVariable String cpf) {
        return repository.findByCpf(cpf)
                .map(usuario -> ResponseEntity.ok(usuario))
                .orElse(ResponseEntity.notFound().build());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Usuarios> updateUsuario(@PathVariable Long id, @RequestBody Usuarios usuarioDetails) {
        Optional<Usuarios> usuarioOptional = repository.findById(id);
        if (!usuarioOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Usuarios usuario = usuarioOptional.get();
        usuario.setNome(usuarioDetails.getNome());
        usuario.setCpf(usuarioDetails.getCpf());
        usuario.setIdade(usuarioDetails.getIdade());
        usuario.setEndereco(usuarioDetails.getEndereco());
        usuario.setCorfavorita(usuarioDetails.getCorfavorita());

        Usuarios updatedUsuario = repository.save(usuario);
        return ResponseEntity.ok(updatedUsuario);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        Optional<Usuarios> usuario = repository.findById(id);

        if (!usuario.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(usuario.get());
        return ResponseEntity.ok().build();
    }

}
