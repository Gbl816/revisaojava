import java.util.Scanner;
//att teste equals
public class Main {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        String a, b;
        System.out.println("digite um nome");
        a = ma.nextLine();
        System.out.println("digite outro nome");
        b = ma.nextLine();
        if(a.equals(b)){
            System.out.println("acertou");
            
            
        }else{
            System.out.println("errou");
        }
            }
}

