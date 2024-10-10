import java.util.Scanner;
//att 7 peso

public class Main {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        double peso, mercurio, venus, marte, jupiter, saturno, urano;
        System.out.println("Digite seu peso em kg:");
        peso = ma.nextDouble();
        mercurio = peso *0.37;
        System.out.println("Seu peso em mercurio seria: " +mercurio + "kg");
        venus = peso * 0.88;
         System.out.println("Seu peso em venus seria: " +venus + "kg");
        marte = peso * 0.38;
         System.out.println("Seu peso em marte seria: " +marte + "kg");
        jupiter = peso * 2.64;
         System.out.println("Seu peso em jupiter seria: " +jupiter + "kg");
        saturno = peso * 1.15;
         System.out.println("Seu peso em saturno: " +saturno + "kg");
        urano = peso * 1.17;
         System.out.println("Seu peso em urano seria: " +urano + "kg");
            }
}
