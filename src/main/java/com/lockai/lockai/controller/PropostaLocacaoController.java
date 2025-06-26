package com.lockai.lockai.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.lockai.lockai.entity.PropostaLocacao;
import com.lockai.lockai.service.PropostaLocacaoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/propostas")
public class PropostaLocacaoController {

    @Autowired
    private PropostaLocacaoService service;

    @GetMapping
    public ResponseEntity<List<PropostaLocacao>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PropostaLocacao> buscarPorId(@PathVariable Integer id) {
        Optional<PropostaLocacao> proposta = service.buscarPorId(id);
        return proposta.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PropostaLocacao> criar(@RequestBody PropostaLocacao proposta) {
        return new ResponseEntity<>(service.salvar(proposta), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PropostaLocacao> atualizar(@PathVariable Integer id, @RequestBody PropostaLocacao proposta) {
        return ResponseEntity.ok(service.atualizar(id, proposta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}