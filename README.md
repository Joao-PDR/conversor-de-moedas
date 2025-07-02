# 💰 Challenge Conversor de Moedas

## 📖 Descrição
Projeto desenvolvido como parte do Challenge de Java da Alura em parceria com a Oracle (Programa ONE). O objetivo é criar um conversor de moedas que consome uma API em tempo real para obter as taxas de câmbio e permitir que o usuário realize conversões entre diferentes moedas.

---

## ✨ Funcionalidades
- **Menu Interativo:** O usuário pode escolher entre 6 opções de conversão de moedas diretamente no console.
- **Consumo de API:** Conecta-se à API da [ExchangeRate-API](https://www.exchangerate-api.com/) para obter cotações atualizadas.
- **Conversão em Tempo Real:** Realiza os cálculos de conversão com base nas taxas mais recentes.
- **Código Reutilizável:** A lógica de conversão foi refatorada para um método que pode ser facilmente expandido para outras moedas.

---

## 🛠️ Tecnologias Utilizadas
- **Java 21:** Versão mais recente do Java.
- **Gson 2.10.1:** Biblioteca do Google para "ler" e manipular dados em formato JSON.
- **IntelliJ IDEA:** IDE utilizada para o desenvolvimento.
- **Git & GitHub:** Para versionamento e armazenamento do código.

---

## 🚀 Como Executar
1. Clone o repositório:
   ```bash
   git clone [https://github.com/Joao-PDR/conversor-de-moedas.git](https://github.com/Joao-PDR/conversor-de-moedas.git)
2. Abra o projeto na sua IDE Java (ex: IntelliJ IDEA).

3. Adicione a biblioteca Gson 2.10.1 ao projeto.

4. Crie uma conta na ExchangeRate-API para obter sua própria API Key.

5. Na classe ConsultaMoeda.java, substitua o texto "SUA_CHAVE_API" pela sua chave.

6. Execute a classe Principal.java.
