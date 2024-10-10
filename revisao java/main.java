import java.util.Scanner;
// att 4 salario usando constante
public class main {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        float salario;
        final float SALARIOMINIMO = 1412;
        System.out.println("Qual seu salario?");
        salario = ma.nextFloat();
        System.out.println("Seu salario comparado ao salario minimo e de:" + (salario - SALARIOMINIMO));
    }
}