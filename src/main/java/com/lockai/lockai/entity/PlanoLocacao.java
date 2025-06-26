package com.lockai.lockai.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //essa classe representa uma tabela no banco
@Data   //gera automaticamente os getters/setters com o Lombok
@NoArgsConstructor
@AllArgsConstructor
public class PlanoLocacao {

    @Id                                                 // <-- configura o campo id como
    @GeneratedValue(strategy = GenerationType.IDENTITY) // <-- chave primária autoincrementável
    private Integer id;

    private String nome;
    private String dataInicio;
    private String dataFim;
    private String veiculo;
    private String fmlLocacao;
    private String prazoPagamento;
    private String situacao;

    private int idUsuarioCadastro;
    private int idUsuarioAtualizacao;
}
