# 🍔 Hamburgueria-java

Sistema de gerenciamento de pedidos de uma hamburgueria desenvolvido em Java. O projeto simula o fluxo real de um carrinho de compras de um e-commerce ou sistema de PDV (Ponto de Venda).

## 🚀 Funcionalidades
- **Montagem do Carrinho:** Permite adicionar múltiplos lanches no mesmo pedido.
- **Validação de Cardápio:** Proteção com estruturas de repetição para evitar itens inválidos.
- **Fechamento de Conta:** Separação lógica entre a escolha dos itens e a etapa de pagamento.
- **Regras de Negócio Financeiras:**
  - Desconto de 10% para pagamentos via Pix.
  - Cálculo automatizado de troco para pagamentos em Dinheiro (com validação de valor insuficiente).
  - Aprovação direta para pagamentos em Cartão.

## 🛠️ Tecnologias Utilizadas
- **Java** (JDK 17 ou superior)
- **Scanner** (Entrada de dados via console)
- Lógica de controle de fluxo com `while`, `if/else`, `break` e `continue`.
