CREATE DATABASE IF NOT EXISTS TR_Energia;
USE TR_Energia;

CREATE TABLE Usuarios (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Nome VARCHAR(255) NOT NULL,
    CPF VARCHAR(14) UNIQUE NOT NULL,
    Idade INT,
    Endereco VARCHAR(255),
    CorFavorita VARCHAR(50)
);

INSERT INTO Usuarios (cpf, nome,Idade,Endereco,CorFavorita)
VALUES ('56445654654', 'Arthur',22,'Xique Xiqui','Preto');
