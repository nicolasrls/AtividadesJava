package Lista02;
import java.util.Scanner;

public class q7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontos = 0;
        int premio = 0;
        while (true) {
            System.out.println("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            System.out.println("Digite o segundo número: ");
            int num2 = scanner.nextInt();
            if (num1 > 0 && num2 < 0) {
                break;
            }
            if (num1 < num2) {
                pontos++;
                System.out.println("Ponto marcado!");
            }
            premio = pontos / 10;
        }
        System.out.println("Total de pontos: " + pontos);
        System.out.println("Valor do prêmio: R$ " + premio);
    }
}