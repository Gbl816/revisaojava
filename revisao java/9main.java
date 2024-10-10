import java.util.Scanner;

// att maio numero
public class Main {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Digite um numero:");
        n1 = Integer.parseInt(ma.nextLine());
        
        System.out.println("Digite um segundo numero:");
         n2= Integer.parseInt(ma.nextLine());

        System.out.println("Digite um terceiro numero:");
         n3 = Integer.parseInt(ma.nextLine());
        if(n1 > n2 && n1 >n3){
            System.out.printf("O maior numero e: %d", n1);
        }
        else if(n2>n1 && n2>n3){
            System.out.printf("O maior numero e: %d", n2);
            
        } else if(n3>n2 && n3>n1){
            System.out.printf("O maior numero e: %d", n3);
        } else{
            System.out.println("!ERRO! Digite numeros validos ou diferentes.");
        }
        
      

        
        
            }
}