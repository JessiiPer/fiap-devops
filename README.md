# fiap-devops

Aplicação Java mínima para validar pipeline de CI/CD com GitHub Actions.

## Como rodar localmente

Pré-requisito: Java 17+ e Maven 3.9+

```bash
mvn clean test
java -cp target/classes App
```

## CI no GitHub Actions

O workflow em `.github/workflows/ci.yml` é executado em `push` e `pull_request`.
Ele configura Java 17 e executa build + testes com Maven (`mvn -B clean test`).
