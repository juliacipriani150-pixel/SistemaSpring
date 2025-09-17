1. Introdução

Este README tem como objetivo apresentar as instruções necessárias para a configuração e execução de um projeto desenvolvido em Spring Boot, utilizando a linguagem Java.
A aplicação foi projetada para ser executada em ambiente local, acessível por meio do navegador, utilizando o endereço localhost.

2. Tecnologias Utilizadas

- O projeto foi desenvolvido com base nas seguintes tecnologias:

- Java 17 ou superior – Linguagem de programação principal.

- Spring Boot 3 ou superior – Framework para desenvolvimento ágil de aplicações Java.

- Spring Data JPA – Abstração para integração com banco de dados, facilitando operações de persistência.

- Thymeleaf – Template engine para construção de páginas dinâmicas.

- MySQL – Banco de dados relacional utilizado para armazenamento de informações.

- Maven – Ferramenta de gerenciamento de dependências e automação de build.

3. Pré-requisitos

Para garantir o correto funcionamento do projeto, é necessário que o ambiente de desenvolvimento possua os seguintes recursos instalados:

- Java Development Kit (JDK), versão 17 ou superior.

- Maven, para gerenciamento de dependências e execução.

- Git, caso seja necessário clonar o repositório do projeto.

- Uma IDE compatível com Java, como IntelliJ IDEA, Eclipse ou Visual Studio Code.

- Banco de dados MySQL instalado e configurado.

4. Estrutura do Projeto

O projeto segue a estrutura padrão de aplicações Spring Boot, composta pelos seguintes elementos principais:

- Diretório main/java: contém o código-fonte da aplicação.

- Diretório main/resources: armazena arquivos de configuração, como o application.properties ou application.yml.

- Diretório test: destinado aos testes automatizados do sistema.

- Classe principal anotada com @SpringBootApplication, responsável por iniciar a aplicação.

5. Execução do Projeto

A aplicação pode ser iniciada da seguinte forma:

- Utilizando o Maven, diretamente pela linha de comando.

- Importando o projeto em uma IDE e executando a classe principal da aplicação.

- Ao ser inicializado, o Spring Boot realiza a configuração automática e disponibiliza a aplicação para acesso.

6. Acesso à Aplicação

Uma vez em execução, a aplicação pode ser acessada por meio do navegador, utilizando o endereço http://localhost:8088/alunos

7. Considerações Finais

Este relatório apresentou as instruções necessárias para a configuração e execução de um projeto Spring Boot em ambiente local.
A utilização do localhost facilita o desenvolvimento, a realização de testes e a validação de funcionalidades antes da implantação em ambientes de homologação ou produção.