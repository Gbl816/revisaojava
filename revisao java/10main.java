import java.util.Scanner;
//att boletim
public class Main {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        float n1, n2, n3;
        float media, resultado;
        System.out.println("Sistemas de nota da escola");
        System.out.println("Digite sua nota de matematica");
        n1 = Float.parseFloat(ma.nextLine());
        System.out.println("Digite sua nota de quimica");
        n2 = Float.parseFloat(ma.nextLine());
        System.out.println("Digite sua nota de fisica");
        n3 = Float.parseFloat(ma.nextLine());
        media = n1+n2+n3;
        resultado = media/3;
        System.out.printf("Sua media e: %.2f ",resultado);
        if (resultado >= 7){
            System.out.println("Voce foi aprovado");
        } else if(resultado>5 && resultado<7){
            System.out.println("Voce esta na final");
        } else{
            System.out.println("Voce esta reprovado");
        }
            }
}

