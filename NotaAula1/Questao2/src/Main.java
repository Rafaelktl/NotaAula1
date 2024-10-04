import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Digite o nome do produto: ");
        produto.setNome(scanner1.nextLine());
        System.out.println("Digite a cor do produto: ");
        produto.setCor(scanner1.nextLine());
        System.out.println("Digite o peso do produto (em kg): ");
        produto.setPeso(scanner.nextInt());
        System.out.println("Digite o valor do produto: ");
        produto.setValor(scanner.nextDouble());
        System.out.println("Digite o código do produto: ");
        produto.setCodigo(scanner.nextInt());
        System.out.println("Digite o estoque do produto: ");
        produto.setEstoque(scanner.nextInt());

        int repetir = 0;
        do {
            System.out.println("Digite 1 para pagar em Pix/Espécie/Transferência/Débito (5% de desconto).");
            System.out.println("Digite 2 para pagar em Crédito ou Parcelar em até 3x sem juros");
            int numero = scanner.nextInt();
            switch(numero) {
                case 1:
                    System.out.printf("Valor a ser pago com desconto: %.2f ", produto.getDesconto());
                    break;
                case 2:
                    System.out.println("Digite em quantas vezes quer parcelar (3x sem juros): ");
                    produto.setParcela(scanner.nextDouble());
                    System.out.printf("Valor a ser pago por mês: %.2f ", produto.getParcela());
                    break;
                default:
                    System.out.println("Número inválido");
            }
            System.out.println("Para repetir digite 0: ");
            repetir = scanner.nextInt();
        } while(repetir == 0);

    }
}