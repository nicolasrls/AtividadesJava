package Lista02;
import java.util.*;

public class q3 {
    public static double calcularCreditoExtra(double sal){
        if (sal <= 800.00) {
            return sal * 0.05;  // 5% de acréscimo
        } else if (sal <= 2000.00) {
            return sal * 0.10;  // 10% de acréscimo
        } else {
            return sal * 0.15;  // 15% de acréscimo
        }
    }
    public static void main(String[] args) {
        double salario = 1420 , salarioComAcresc = 0;
        salarioComAcresc += calcularCreditoExtra(salario);
        salarioComAcresc += salario;
        System.out.println("O salário com acréscimo foi de: " + salarioComAcresc);
    }
}
