import java.util.Scanner;
//att 5 peso terra

public class main {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        float peso, altura;
        System.out.println("Diga seu peso em kg:");
        peso = ma.nextFloat();
        System.out.println("Diga sua altura em metros:");
        altura = ma.nextFloat();
        System.out.println("Seu peso e: " + peso + " kg e sua altura em metros e: " + altura + " Metros " );
    }
}