import java.util.Scanner;

public class Hamburgueria {
    public static void main(String[] args) {

        String tipoLanche = "";

        try (Scanner leitor = new Scanner(System.in)) {

            while (!tipoLanche.equalsIgnoreCase("Cancelar")) {
                System.out.println("Faça o seu pedido: (X-burger, X-Bacon ou Especial)");
                tipoLanche = leitor.nextLine();

                if (tipoLanche.equalsIgnoreCase("Cancelar")) {
                    System.out.println("Volte sempre!");
                    break;
                } else {

                    double preco;

                    // Validação exata de cada lanche do cardápio
                    if (tipoLanche.equalsIgnoreCase("X-burger")) {
                        preco = 15.00;
                    } else if (tipoLanche.equalsIgnoreCase("X-bacon")) {
                        preco = 18.00;
                    } else if (tipoLanche.equalsIgnoreCase("Especial")) {
                        preco = 21.00;
                    } else {
                        System.out.println("Lanche inválido! Por favor, escolha uma opção do cardápio.");
                        continue;
                    }

                    // Bloco de Pagamento
                    System.out.println("Escolha a forma de pagamento: Pix, Cartão ou dinheiro");
                    String formaPagamento = leitor.nextLine();

                    if (formaPagamento.equalsIgnoreCase("Pix")) {
                        preco = preco * 0.90; // 10% de desconto

                    } else if (formaPagamento.equalsIgnoreCase("Dinheiro")) {
                        System.out.println("Com quanto vai pagar?");
                        double valorPago = leitor.nextDouble();
                        leitor.nextLine();

                        double troco = valorPago - preco;
                        System.out.println("Seu troco é de R$:" + troco);

                    } else if (formaPagamento.equalsIgnoreCase("Cartão")) {
                        System.out.println("Pagamento aprovado!");
                    }


                    System.out.println("O valor total é de R$: " + preco);
                    System.out.println("Pedido finalizado com sucesso!");
                    break;
                }
            }
        }
    }
}