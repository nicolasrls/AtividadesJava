package Lista02;
import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura = 0, alturaMax = 0, count = 0, i=0, soma=0;
		double media = 0;
		
		while(i<20) {
			System.out.print("-----Digite sua altura em centímetros: -----\n");
			altura = sc.nextInt();
			soma += altura;
			if(altura > alturaMax) {
				alturaMax = altura;
			}
			if(altura > 200){
				count++;
			}
			i++;
		}
		media = soma / i;
		System.out.print("-----Vamos aos resultados -----\n");
		System.out.printf("-----Altura média: %.1f -----\n", media);
		System.out.printf("-----Altura máx: %d cm -----\n",alturaMax);
		System.out.printf("-----Pessoas com mais de 2m: %d -----\n",count);
		}

}
