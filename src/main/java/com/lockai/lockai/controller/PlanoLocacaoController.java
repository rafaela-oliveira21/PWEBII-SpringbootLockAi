package com.lockai.lockai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.lockai.lockai.entity.PlanoLocacao;
import com.lockai.lockai.service.PlanoLocacaoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/planos")
public class PlanoLocacaoController {

    @Autowired
    private PlanoLocacaoService service;

    @GetMapping
    public ResponseEntity<List<PlanoLocacao>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlanoLocacao> buscarPorId(@PathVariable Integer id) {
        Optional<PlanoLocacao> plano = service.buscarPorId(id);
        return plano.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PlanoLocacao> criar(@RequestBody PlanoLocacao plano) {
        return new ResponseEntity<>(service.salvar(plano), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlanoLocacao> atualizar(@PathVariable Integer id, @RequestBody PlanoLocacao plano) {
        return ResponseEntity.ok(service.atualizar(id, plano));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
