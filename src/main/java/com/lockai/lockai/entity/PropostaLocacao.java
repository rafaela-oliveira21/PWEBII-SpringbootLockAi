package com.lockai.lockai.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropostaLocacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String data;
    private int idUsuario;
    private int idObjeto;
    private int idPlanoLocacao;

    private String dataInicio;
    private String dataFim;
    private Float valor;
    private String motivo;
    private char situacao;

    private String dataAtualizacao;
    private int idUsuarioAtualizacao;
}