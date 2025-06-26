package com.lockai.lockai.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lockai.lockai.entity.PlanoLocacao;
import com.lockai.lockai.repository.PlanoLocacaoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PlanoLocacaoService {

    @Autowired
    private PlanoLocacaoRepository repository;

    public List<PlanoLocacao> listarTodos() {
        return repository.findAll();
    }

    public Optional<PlanoLocacao> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public PlanoLocacao salvar(PlanoLocacao plano) {
        return repository.save(plano);
    }

    public PlanoLocacao atualizar(Integer id, PlanoLocacao planoAtualizado) {
        PlanoLocacao plano = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Plano não encontrado"));
        BeanUtils.copyProperties(planoAtualizado, plano, "id");
        return repository.save(plano);
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }
}
