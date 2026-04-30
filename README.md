# 🥖 Sistema de Padaria (Java)

## 📌 Descrição
Este é um programa simples em Java que simula o processo de pagamento em uma padaria. Ele permite:

- Receber o nome do cliente  
- Informar o valor da compra  
- Informar o valor pago  
- Calcular o troco  
- Exibir o troco detalhado em notas disponíveis  

## ⚙️ Funcionalidades
- Validação de pagamento (verifica se o valor pago é suficiente)
- Cálculo automático do troco
- Distribuição do troco usando as seguintes notas:
  - R$200, R$100, R$50, R$20, R$10, R$5, R$2 e R$1
- Exibição organizada da quantidade de cada nota
- Mensagem final personalizada para o cliente

## 🧠 Lógica aplicada
O sistema utiliza:

- Estrutura de repetição (`for` + `while`) para calcular a quantidade de notas
- Array de inteiros para representar as cédulas disponíveis
- Condicional (`if/else`) para validação de pagamento
- Subtração sucessiva para determinar o troco

## ▶️ Como executar

### Pré-requisitos
- Java JDK 8 ou superior

### Passos
1. Salve o arquivo como `Padaria.java`
2. Compile o programa:
   ```bash
   javac Padaria.java
