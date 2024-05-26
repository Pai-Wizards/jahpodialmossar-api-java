# API jahpodialmossar

Esta é uma simples API construída com Spring Boot que fornece informações sobre se é hora de almoçar ou não.
## Requisitos

    JDK 11 ou superior
    Gradle

## Execução

Após clonar o repositório, acesse o diretório do projeto e execute o seguinte comando para compilar a aplicação:

```
    ./gradlew bootRun
```

A API estará disponível em http://localhost:8080/api.

## Utilização

Envie uma requisição GET para /api. Você receberá uma resposta indicando se é hora de almoçar ou não.

Exemplo de requisição:

```bash
curl http://localhost:8080/api
```

Exemplo de resposta:

```json

{
    "message": "É oficial. Já pode almoçar. 🍽️",
    "time": "2024-05-26T12:30:45.123456789"
}
``` 

#### Notas

Esta API considera que o horário de almoço é entre 11h e 14h.
O teor das mensagens pode variar de acordo com a hora do dia e a fome do desenvolvedor.