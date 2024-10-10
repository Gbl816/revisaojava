import java.util.Scanner;
import java.time.LocalDate;
//att 1 nome 
public class main {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        String nome;
        System.out.println("Qual seu nome?");
        nome = ma.nextLine();
        System.out.println("Seu nome e: "+ nome);
    }
}
