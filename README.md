# Projeto Web – Cadastro de Alunos em Sistema Escolar

**UC:** Desenvolvimento de Sistemas  
**Docente:** Gerson Trindade  
**Data:** 16/09/2025  
**Alunos:** Emilly Thalita e Júlia Cipriani
---

## 🏆 Objetivo do Projeto
Desenvolver uma aplicação web funcional utilizando **Spring Boot**, com persistência de dados em banco relacional (**MySQL**) e interface web com **Thymeleaf**, permitindo o cadastro e listagem de alunos em um sistema escolar.

---

## 📌 Descrição
A aplicação permite que o usuário:

- Cadastre alunos preenchendo um formulário com informações pessoais e acadêmicas.
- Visualize todos os alunos cadastrados na mesma página do formulário.
- Armazene os dados de forma persistente no banco MySQL.

---

## 💻 Tecnologias Utilizadas

- Java 17+
- Spring Boot 3+
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven

---

## ⚙ Funcionalidades

1. **Cadastro de Aluno** com os campos:
   - ID (Long)
   - Nome (String)
   - Matrícula (String)
   - Curso (String)
   - Idade (Int)
2. **Listagem** de alunos cadastrados.
3. **Persistência** dos dados no banco MySQL.

---


## 🛠 Etapas de Desenvolvimento

### 1️⃣ Configuração do Projeto
- Criar projeto Spring Boot com dependências:
  - Spring Web
  - Thymeleaf
  - Spring Data JPA
  - MySQL Driver

### 2️⃣ Configuração do Banco de Dados
No `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/dbescola
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Certifique-se que o banco dbescola exista e o XAMPP/MySQL esteja ativo.

3️⃣ Criar a Entidade Aluno
Campos: id, nome, matricula, curso, idade

Gerar getters e setters automaticamente.

4️⃣ Criar o Repositório
Interface AlunoRepository extendendo JpaRepository.

5️⃣ Criar o Controller
AlunoController com rotas:

GET /alunos → exibe formulário e lista

POST /alunos/salvar → salva o aluno no banco

6️⃣ Criar HTML com Thymeleaf
Formulário para cadastro
