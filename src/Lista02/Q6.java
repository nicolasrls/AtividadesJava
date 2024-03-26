package Lista02;
import java.util.*;

public class Q6 {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            double total = 0.0, totalGer = 0;
            int quantidade;
            String prosseg = "S";
            double valorUnitario;



            do{
                System.out.println("Digite a quantidade de produtos: ");
                quantidade = scanner.nextInt();
                System.out.println("Digite o valor unitário do produto: ");
                valorUnitario = scanner.nextDouble();
                total += quantidade * valorUnitario;
                System.out.println("Itens: " + quantidade + " valor unitário: "+valorUnitario);
                System.out.println("Valor total da venda: R$ " + String.format("%.2f", total));


                System.out.println("-----Deseja prosseguir? S para sim, N para não -----");
                prosseg = scanner.next();
                totalGer += total;
                total = 0;
            }while(prosseg.equals("S"));
            System.out.println("Sua feira deu: R$"+totalGer);
    }
}
