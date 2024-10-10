import java.util.Scanner;
//att 8 notas sem limite decimal

public class Main {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        float n1, n2, n3;
        float media, resultado;
        System.out.println("Sistemas de nota da escola");
        System.out.println("Digite sua nota de matematica");
        n1 = Float.parseFloat(ma.nextLine());
        System.out.println("Digite sua nota de quimica");
        n2 = Float.parseFloat(ma.nextLine());
        System.out.println("Digite sua nota de fisica");
        n3 = Float.parseFloat(ma.nextLine());
        media = n1+n2+n3;
        resultado = media/3;
        System.out.printf("Sua media e: "+resultado);
            }
}
