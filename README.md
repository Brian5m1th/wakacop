# Wakacop

Aplicação Spring Boot usando PostgreSQL para persistência de dados.

---

## Tecnologias

- Java 17+ / Spring Boot  
- Spring Data JPA  
- PostgreSQL  
- Maven  
- Lombok  

---

## Configuração

### Variáveis de ambiente

O projeto utiliza variáveis de ambiente para configuração do banco de dados. Crie um arquivo `.env` na raiz do projeto (não envie esse arquivo para o Git!) com as seguintes variáveis:

```env
SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/wakacopdb
SPRING_DATASOURCE_USERNAME=seu_usuario
SPRING_DATASOURCE_PASSWORD=sua_senha
