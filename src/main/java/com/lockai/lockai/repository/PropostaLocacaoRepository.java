package com.lockai.lockai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lockai.lockai.entity.PropostaLocacao;

@Repository
public interface PropostaLocacaoRepository extends JpaRepository<PropostaLocacao, Integer> {
}
