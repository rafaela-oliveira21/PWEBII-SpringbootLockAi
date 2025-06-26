import java.util.Scanner;

public class AreaResidencial {
    public static void main(String[] args) {
        /*
        Leitura do nome do comodo, largura e altura
        exibir area total da casa
        * */
        Scanner leitor = new Scanner(System.in);
        String nomeComodo, continuar = "Sim";
        double largura, altura, areaComodo, areaTotal = 0;

        while (continuar.equals("Sim")) {
            System.out.println("Digite o nome do comodo:");
            nomeComodo = leitor.next();
            System.out.println("Largura: ");
            largura = leitor.nextDouble();
            System.out.println("Altura: ");
            altura = leitor.nextDouble();
            areaComodo = largura * altura;
            System.out.println("Área do(a) " + nomeComodo);

            areaTotal += areaComodo; //areaTotal = areaTotal + areaComodo
            System.out.println("Tem mais comodos? Sim ou Não");
            continuar = leitor.next();
        }
        System.out.println("Area total = " + areaTotal);

    }
}
