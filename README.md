# 💰 Banco Digital em Java

Um projeto simples de um **banco digital** desenvolvido em Java, com foco em **orientação a objetos**. Ele simula operações bancárias como depósitos, saques, transferências e extratos, utilizando boas práticas e a biblioteca **Lombok** para simplificar o código.

---

## 🧱 Estrutura do Projeto

O sistema é composto pelas seguintes classes principais:

| Classe            | Descrição                                                                 |
|-------------------|---------------------------------------------------------------------------|
| `Cliente`         | Representa um cliente do banco (nome e CPF).                              |
| `Conta`           | Classe abstrata base para contas bancárias.                              |
| `ContaCorrente`   | Conta com taxa de manutenção mensal.                                      |
| `ContaPoupanca`   | Conta com rendimento mensal automático.                                   |
| `Banco`           | Responsável por gerenciar as contas criadas.                             |
| `Main`            | Classe principal para simular e testar as funcionalidades.                |

---

## ✅ Funcionalidades

- Criar contas correntes e poupança para clientes
- Depositar e sacar valores
- Transferência entre contas
- Impressão de extrato com histórico de transações
- Taxa de manutenção em contas correntes
- Rendimento mensal para contas poupança

---

## 📦 Tecnologias utilizadas

- **Java 17+**
- **Lombok**
- **Maven** (gerenciamento de dependências)
