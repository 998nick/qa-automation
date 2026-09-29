# QA Automation Starter

Projeto base: Java + Maven + JUnit 5, evoluindo para Selenium WebDriver e pipeline CI/CD com GitHub Actions.

## Estrutura
```
src/main/java/com/diego/model/   -> classes de domínio (Usuario, UsuarioAdmin)
src/test/java/com/diego/model/   -> testes unitários (JUnit 5)
pom.xml                          -> dependências e build (Maven)
```

## Como rodar localmente
```bash
mvn test
```

## Roadmap deste projeto
- [x] Passo 1: estrutura Java + Maven + JUnit
- [ ] Passo 2: Selenium WebDriver (testes de UI)
- [ ] Passo 3: Page Object Model
- [ ] Passo 4: GitHub Actions (CI/CD)
- [ ] Passo 5: manutenção contínua (relatórios, flaky tests)
