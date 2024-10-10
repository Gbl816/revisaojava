import java.util.Scanner;
// att 6 euclidiana

public class Main {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema para resolver questoes de distancia eucliadiana, por favor: ");
        int x1, x2, y1, y2;
        int x3, y3, x4, y4, x5;
         System.out.println("coloque o valor de x1");
        x1 = ma.nextInt();
         System.out.println("coloque o valor de x2");
         x2 = ma.nextInt();
         System.out.println("coloque o valor de y1");
         y1 = ma.nextInt();
         System.out.println("coloque o valor de y2");
         y2 = ma.nextInt();
        x3 = x1 - x2;
        y3 = y1 - y2;
        x4 = x3 * x3;
        y4 = y3 * y3;
        x5 = x4 + y4;
        int i = (int) (Math.sqrt(x5));
        System.out.println("O resultado da distiancia euclidiana, aproximadamente, e: " +i);
    }
}