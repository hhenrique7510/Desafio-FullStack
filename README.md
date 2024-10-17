Desafio-FullStack

Desafio TR Energia

Este repositório contém um projeto de uma API REST construída com Spring Boot para o desafio técnico proposto pela TR Energia. A API permite realizar operações de CRUD (Create, Read, Update, Delete) para a entidade Usuário.

Tecnologias Utilizadas

- **Spring Boot**: Framework para facilitar a criação de aplicações Spring com menos configuração.
- **Maven**: Ferramenta de automação de compilação utilizada principalmente para projetos Java.
- **MySQL**: Sistemas de gerenciamento de banco de dados para armazenar as informações dos usuários.
- **Lombok**: Biblioteca Java que ajuda a reduzir o código boilerplate.
- **JPA (Java Persistence API)**: Para o mapeamento objeto-relacional.

Estrutura do Projeto

O projeto está organizado da seguinte maneira:

- `src/main/java`: Contém o código-fonte do projeto.
- `src/main/resources`: Contém arquivos de configuração como o `application.properties`.


##Pré-requisitos

- Java 17
- Maven
- MySQL instalado e rodando em sua máquina.


Para executar o projeto, navegue até a raiz do diretório no terminal e execute o comando:

bash
mvn spring-boot:run
Endpoints da API
POST /usuarios: Cadastra um novo usuário.
GET /usuarios/{id}: Retorna os detalhes de um usuário específico pelo ID.
GET /usuarios/cpf/{cpf}: Retorna os detalhes de um usuário pelo CPF.
GET /usuarios: Lista todos os usuários cadastrados.
PUT /usuarios/{id}: Atualiza os dados de um usuário existente.
DELETE /usuarios/{id}: Exclui um usuário pelo ID.
