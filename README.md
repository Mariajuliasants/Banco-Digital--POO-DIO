<h1 align="center"> Desafio Banco Digital -POO DIO</h1>


## Descrição Geral
O projeto visa desenvolver um sistema de banco digital utilizando a linguagem de programação Java e os princípios de Orientação a Objetos (OO). A aplicação oferece duas modalidades de conta para os clientes: conta corrente e conta poupança. As operações bancárias fundamentais, como depósito, saque, transferência entre contas da própria instituição e transferência via PIX, são suportadas pelo sistema. Além dessas operações, o sistema inclui funcionalidades adicionais, tais como a interface de métodos para operações, impressão de extratos e exibição de lista de clientes.

## Objetivo
Criar uma solução robusta e escalável para um banco digital, aplicando os conceitos de Orientação a Objetos, como abstração, encapsulamento, herança e polimorfismo, visando um código mais organizado, fácil de manter e evoluir.

## Funcionalidades Implementadas
1. **Contas Bancárias**
   - **Conta Corrente**
   - **Conta Poupança**

2. **Operações Bancárias**
   - **Depósito:** Permite adicionar saldo à conta do cliente.
   - **Saque:** Permite retirar saldo da conta do cliente.
   - **Transferência:** Permite transferir saldo entre contas da própria instituição.
   - **Transferência via PIX:** Permite transferir saldo para contas de qualquer instituição bancária de forma rápida e segura.

3. **Funcionalidades Adicionais**
   - **Interface de Métodos para Operações:** Define os métodos de depósito, saque, transferência e transferência via PIX, facilitando a implementação e manutenção.
   - **Impressão de Extratos:** Método para gerar e imprimir extratos das movimentações da conta.
   - **Lista de Clientes:** Método para exibir a lista de todos os clientes cadastrados no banco.

## Princípios de Orientação a Objetos Aplicados
1. **Abstração**
   - Concentrar-se nos aspectos essenciais do domínio bancário, criando objetos que representam contas e clientes, enquanto abstrai detalhes não essenciais.

2. **Encapsulamento**
   - Esconder a implementação dos objetos (contas e operações) e fornecer interfaces claras para uso, facilitando a manutenção e evolução do sistema.

3. **Herança**
   - Definir uma classe base "Conta" com atributos e métodos comuns, e criar classes derivadas "ContaCorrente" e "ContaPoupança" que herdam e, se necessário, estendem ou modificam o comportamento da classe base.

4. **Polimorfismo**
   - Permitir que objetos de diferentes classes derivadas (ContaCorrente e ContaPoupança) sejam tratados como objetos da classe genérica "Conta", simplificando o código que manipula diferentes tipos de contas.

## Desenvolvimento
**Data de Início:** 02/08/2021  

## Cenário
Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), com as funcionalidades de depósito, saque, transferência entre contas da própria instituição e transferência via PIX.

## Conclusão
Este projeto não apenas fornece uma solução funcional para um banco digital, mas também serve como um excelente exercício prático para aplicar e consolidar conhecimentos de Orientação a Objetos em Java. Através da abstração, encapsulamento, herança e polimorfismo, o sistema desenvolvido é organizado, escalável e de fácil manutenção, refletindo boas práticas de desenvolvimento de software.


<p align="center"> Desenvolvido por Maria Júlia Santos ✨ </p>
