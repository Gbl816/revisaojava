import java.util.Scanner;
//att 2 idade

public class main {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        int ano, idade;
     System.out.println("em que ano voce nasceu?");  
        ano = ma.nextInt();
       idade = 2024 - ano;
        System.out.println("Voce tem: " + idade + "anos");
    }
}