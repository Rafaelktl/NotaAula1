import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Aluno aluno = new Aluno();
        CalculadoraMedia calculadora = new CalculadoraMedia();

        System.out.println("Digite o seu nome: ");
        aluno.nome = scanner1.nextLine();
        System.out.println("Digite sua nota 1: ");
        aluno.nota1 = scanner.nextDouble();
        System.out.println("Digite sua nota 2: ");
        aluno.nota2 = scanner.nextDouble();

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Média: " + calculadora.media(aluno.nota1, aluno.nota2));
        double media = calculadora.media(aluno.nota1, aluno.nota2);

        if (media >= 70){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}