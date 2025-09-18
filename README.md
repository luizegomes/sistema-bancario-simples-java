# 🏦 Sistema Bancário em Java

## 📌 Descrição
Este projeto implementa um **sistema bancário simples** em Java, utilizando conceitos fundamentais de **Programação Orientada a Objetos (POO)**, como:

- **Construtores**
- **Palavra-chave `this`**
- **Sobrecarga de construtores**
- **Encapsulamento**

O programa permite o **cadastro de contas bancárias**, depósitos e saques, seguindo regras específicas de negócio.

---

## 📜 Regras de Negócio
1. **Cadastro de Conta**
   - É necessário informar:
     - Número da conta (**não pode ser alterado após criação**)
     - Nome do titular (**pode ser alterado posteriormente**)
     - Depósito inicial (**opcional**)
   - Caso não seja informado o depósito inicial, o saldo começa em **R$ 0,00**.

2. **Depósitos**
   - Aumentam o saldo da conta.
   - Não possuem taxa.

3. **Saques**
   - Diminuem o saldo da conta.
   - Possuem taxa fixa de **R$ 5,00** por operação.
   - O saldo pode ficar **negativo**.

---

## ⚙️ Funcionalidades
- Criar conta com ou sem depósito inicial.
- Alterar nome do titular.
- Realizar depósitos.
- Realizar saques com taxa.
- Exibir dados da conta após cada operação.

---

## 🛠️ Conceitos Utilizados
- **Construtores**: para inicializar objetos `ContaBancaria` com ou sem depósito inicial.
- **Sobrecarga**: dois construtores diferentes para flexibilizar a criação da conta.
- **Palavra-chave `this`**: para diferenciar atributos de parâmetros e reutilizar código.
- **Encapsulamento**: atributos privados com métodos `get` e `set` controlando acesso e modificações.


---

## 💻 Exemplo de Execução
- Exemplo 1:
<img width="655" height="403" alt="exemplo1" src="https://github.com/user-attachments/assets/4a588c0a-32ee-4d4a-98f2-a3b564fa93cc" />

- Exemplo 2:
<img width="651" height="405" alt="exemplo2" src="https://github.com/user-attachments/assets/65c2c505-0113-4cfa-acfd-4217ba4c13fa" />

