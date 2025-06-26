import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Boa noite, sejam bem vindos");
        System.out.println("Aula de PW - JAVA");
        //Declaração de variável
        //tipo nomeVariavel;
        int idade;
        String nome;
        System.out.println("Digite seu nome: ");
        nome = leitor.next();
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();
        System.out.println(nome + " você tem " + idade
                + " anos.");

    }
}