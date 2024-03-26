package Lista02;
import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		int numero = 0, def = 10, count = 0, i = 0;
		Scanner scan = new Scanner(System.in);
		while(i < def) {
			System.out.println("-----Digite um número: -----");
			numero = scan.nextInt();
			if((numero > 10)&&(numero < 40)) {
				count++;
			}
			i++;
		}
		System.out.print("A quantidade de numeros entre 10 e 40 foram: " + count);
	}

}
