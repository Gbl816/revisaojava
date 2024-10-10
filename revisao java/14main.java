import java.util.Scanner;
//att compareto
public class Main {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        String n1, n2, n3, maior;
        System.out.println("Digite um nome");
        n1 = ma.nextLine();
        System.out.println("Digite um segundo nome");
        n2 = ma.nextLine();
        System.out.println("Digite um terceiro nome");
        n3 = ma.nextLine();
        if(n1.compareTo(n2)>0){
            maior = n1;
            }
        else{
            maior = n2;
        }if(maior.compareTo(n3)>0){
        
        }else{
            maior = n3;
        }
        System.out.println("O nome mais proximo de z e: " + maior);
            }
}
