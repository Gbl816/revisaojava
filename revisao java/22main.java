import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
    System.out.println("Digite uma palavra");
        String p1 = ma.nextLine();
        System.out.println("Digite uma segunda palavra");
        String p2 = ma.nextLine();
         int c1 = p1.length();
         int c2 = p2.length();
        System.out.println("O conteudo da primeira palavra é: "  + p1);
        System.out.println("Seu comprimento é" +c1);
         System.out.println("O conteudo da segunda palavra é: " + p2);
         System.out.println("Seu comprimento é" +c2);
        if(p1.equals(p2) && c1==c2){
            System.out.println("Elas possuem o mesmo comprimento e conteudo");
        } else if(p1.equals(p2) && c1!=c2) {
            System.out.println("Elas possuem o mesmo conteudo mas nao o mesmo comprimento");
        } else if(c1==c2 && !p1.equals(p2)){
            System.out.println("Elas possuem o mesmo comprimento mas nao o mesmo conteudo");
            
        }else{
            System.out.println("Elas nao possuem o mesmo comprimento e conteudo");
        }

    }
}