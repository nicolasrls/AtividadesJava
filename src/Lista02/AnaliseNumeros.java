package Lista02;
import java.util.Scanner;

public class AnaliseNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeNumerosAbaixo35 = 0, somaNumerosPositivos = 0, quantidadeNumerosPositivos = 0, quantidadeNumerosEntre50e100 = 0, quantidadeNumerosMenores50 = 0;

        while (true) {
            System.out.println("Digite um número (ou um número negativo para finalizar): ");
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            if (numero < 35) {
                quantidadeNumerosAbaixo35++;
            }
            if (numero > 0) {
                somaNumerosPositivos += numero;
                quantidadeNumerosPositivos++;
            }
            if (numero >= 50 && numero <= 100) {
                quantidadeNumerosEntre50e100++;
            }
            if (numero >= 10 && numero <= 20 && numero < 50) {
                quantidadeNumerosMenores50++;
            }
        }
        double mediaNumerosPositivos = 0.0;
        if (quantidadeNumerosPositivos > 0) {
            mediaNumerosPositivos = (double) somaNumerosPositivos / quantidadeNumerosPositivos;
        }
        double percentagemNumerosEntre50e100 = 0.0;
        if (quantidadeNumerosPositivos > 0) {
            percentagemNumerosEntre50e100 = (double) quantidadeNumerosEntre50e100 / quantidadeNumerosPositivos * 100;
        }
        double percentagemNumerosEntre10e20 = 0.0;
        if (quantidadeNumerosMenores50 > 0) {
            percentagemNumerosEntre10e20 = (double) quantidadeNumerosMenores50 / quantidadeNumerosMenores50 * 100;
        }
        System.out.println("Quantidade de números abaixo de 35: " + quantidadeNumerosAbaixo35);
        System.out.println("Média dos números positivos: " + String.format("%.2f", mediaNumerosPositivos));
        System.out.println("Percentagem de números entre 50 e 100: " + String.format("%.2f%%", percentagemNumerosEntre50e100));
        System.out.println("Percentagem de números entre 10 e 20 (menores que 50): " + String.format("%.2f%%", percentagemNumerosEntre10e20));
    }
}
