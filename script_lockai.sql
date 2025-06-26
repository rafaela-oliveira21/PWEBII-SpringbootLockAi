CREATE TABLE PlanoLocacao (
    id INT PRIMARY KEY IDENTITY,
    nome VARCHAR(100),
    dataInicio VARCHAR(20),
    dataFim VARCHAR(20),
    veiculo VARCHAR(50),
    fmlLocacao VARCHAR(50),
    prazoPagamento VARCHAR(50),
    situacao CHAR(1),
    idUsuarioCadastro INT,
    idUsuarioAtualizacao INT
);

CREATE TABLE PropostaLocacao (
    id INT PRIMARY KEY IDENTITY,
    data VARCHAR(20),
    idUsuario INT,
    idObjeto INT,
    idPlanoLocacao INT,
    dataInicio VARCHAR(20),
    dataFim VARCHAR(20),
    valor FLOAT,
    motivo VARCHAR(255),
    situacao CHAR(1),
    dataAtualizacao VARCHAR(20),
    idUsuarioAtualizacao INT
);
