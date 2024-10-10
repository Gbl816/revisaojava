import java.util.Scanner;
import java.time.LocalDate;
// att 3 idade usando localdate
public class main {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        int ano, idade;
     System.out.println("em que ano voce nasceu?");  
        ano = ma.nextInt();
        idade = LocalDate.now().getYear() - ano;
        System.out.println("Voce tem: " + idade + "anos");
    }
}