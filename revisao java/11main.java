import java.util.Scanner;
// att 11 negativo e positivo
public class Main {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        float n1;
        System.out.println("Digite um numero:");
        n1 = Float.parseFloat(ma.nextLine());
        if(n1>0){
            System.out.println("O numero e positivo.");
        } else if(n1<0){
            System.out.println("O numero e negativo.");
        } else {
            System.out.println(" o numero e neutro, ou seja, zero.");
        }
       
            }
}
