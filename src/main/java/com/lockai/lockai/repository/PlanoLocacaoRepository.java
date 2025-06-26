package com.lockai.lockai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lockai.lockai.entity.PlanoLocacao;

@Repository
public interface PlanoLocacaoRepository extends JpaRepository<PlanoLocacao, Integer> {
}