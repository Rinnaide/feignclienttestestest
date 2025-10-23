# CEP Lookup Application

## Descrição Geral

Esta é uma aplicação Spring Boot desenvolvida para consultar informações de endereço a partir de um CEP (Código de Endereçamento Postal) brasileiro. Utilizando o cliente Feign para consumir a API gratuita ViaCEP (https://viacep.com.br/), a aplicação extrai e retorna os dados essenciais de endereço: logradouro (rua), bairro, localidade (cidade) e estado.

## Funcionalidades

- **Consulta de CEP**: Endpoint REST que aceita um CEP como parâmetro e retorna os detalhes do endereço correspondente.
- **Integração com ViaCEP**: Utiliza o Feign Client para fazer chamadas HTTP de forma declarativa e simplificada para a API ViaCEP.
- **Resposta JSON Estruturada**: Retorna apenas os campos necessários (logradouro, bairro, localidade, estado) em formato JSON.
- **Tratamento de Respostas**: Ignora campos extras da API ViaCEP para focar nos dados solicitados.

## Como Funciona

1. A aplicação expõe um endpoint GET `/cep/{cep}`, onde `{cep}` é o código postal brasileiro (ex: 20020-022).
2. O controlador `CepController` recebe a requisição e utiliza o `CepClient` (Feign) para consultar a API ViaCEP.
3. A resposta da API é mapeada para o objeto `CepResponse`, que contém apenas os campos relevantes.
4. Os dados são retornados ao cliente em formato JSON.

## Exemplo de Uso

**Requisição:**
```
GET http://localhost:8080/cep/20020-022
```

**Resposta:**
```json
{
  "logradouro": "Rua Santa Luzia",
  "bairro": "Centro",
  "localidade": "Rio de Janeiro",
  "estado": "Rio de Janeiro"
}
```

## Tecnologias Utilizadas

- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Spring Cloud OpenFeign**: Cliente declarativo para chamadas HTTP.
- **Maven**: Gerenciamento de dependências e build.
- **Java 17**: Linguagem de programação.

## Como Executar

1. Certifique-se de ter o Java 17 e Maven instalados.
2. Clone o repositório e navegue até o diretório do projeto.
3. Execute o comando: `./mvnw spring-boot:run`
4. A aplicação estará disponível em `http://localhost:8080`

## Estrutura do Projeto

- `FeignclienttestestestMainApplication.java`: Classe principal com configuração do Spring Boot e Feign.
- `CepClient.java`: Interface Feign para integração com ViaCEP.
- `CepController.java`: Controlador REST que expõe o endpoint de consulta.
- `CepResponse.java`: Modelo de dados para a resposta da API.
