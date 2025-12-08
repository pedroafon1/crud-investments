# 📊 Investment Aggregator – CRUD API  
Sistema CRUD completo para gerenciamento de investimentos, permitindo cadastrar, listar, atualizar e excluir ativos financeiros. Desenvolvido com foco em organização, escalabilidade e boas práticas de API REST.

---

## 🚀 Sobre o Projeto
O **Investment Aggregator** é uma API que funciona como um agregador de investimentos. Ele permite registrar usuários e seus investimentos, armazenando informações como tipo de ativo, valor aplicado, data, instituição, entre outros.

O objetivo é facilitar o controle financeiro, centralizar dados e servir como base para sistemas maiores, como dashboards ou aplicações mobile.

---

## 🛠️ Tecnologias Utilizadas

### **Backend**
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven

### **Infra**
- Docker / Docker Compose


---

## 📌 Funcionalidades

✔ Cadastro de usuários  
✔ Login básico (se implementado)  
✔ CRUD de investimentos   
✔ Validações de dados  
✔ Respostas padronizadas com ResponseEntity    

---

## 📚 Endpoints Principais

### 👤 **Usuários – /v1/users**

| Método | Endpoint           | Descrição                       |
|--------|---------------------|---------------------------------|
| POST   | `/v1/users`         | Criar novo usuário              |
| GET    | `/v1/users`         | Listar todos os usuários        |
| GET    | `/v1/users/{id}`    | Buscar usuário por ID           |
| PUT    | `/v1/users/{id}`    | Atualizar usuário               |
| DELETE | `/v1/users/{id}`    | Deletar usuário                 |







