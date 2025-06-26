package com.lockai.lockai.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lockai.lockai.entity.PropostaLocacao;
import com.lockai.lockai.repository.PropostaLocacaoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PropostaLocacaoService {

    @Autowired
    private PropostaLocacaoRepository repository;

    public List<PropostaLocacao> listarTodos() {
        return repository.findAll();
    }

    public Optional<PropostaLocacao> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public PropostaLocacao salvar(PropostaLocacao proposta) {
        return repository.save(proposta);
    }

    public PropostaLocacao atualizar(Integer id, PropostaLocacao propostaAtualizada) {
        PropostaLocacao proposta = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Proposta não encontrada"));
        BeanUtils.copyProperties(propostaAtualizada, proposta, "id");
        return repository.save(proposta);
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }
}
