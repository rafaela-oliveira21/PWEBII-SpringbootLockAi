import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //Leitura de 2 valores e as 4 operações
        Scanner leitor = new Scanner(System.in);
        double n1, n2, soma, subtracao, multiplicacao;
        double divisao;
        System.out.println("Digite o primeiro número: ");
        n1 = leitor.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = leitor.nextDouble();

        soma = n1 + n2;
        subtracao = n1 - n2;

        multiplicacao = n1 * n2;
        System.out.println("Soma = " + soma + "\n" + n1 + " - " + n2 + " = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        if(n2 > 0) {
            divisao = n1 / n2;
            System.out.println("Divisão = " + divisao);
        }
        else{
            System.out.println("Não é possível dividir por zero.");
        }

    }
}
