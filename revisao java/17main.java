import java.util.Scanner;

// att switch

public class main {
  public static void main(String[] args) {
    Scanner ma = new Scanner(System.in);
   int codigo;
    System.out.println("Digite o codigo da comida:");
    codigo = Integer.parseInt(ma.nextLine());
    
  switch(codigo){
    case 1 : System.out.println("Voce escolheu pizza");
      break;
    case 2 : System.out.println("Voce escolheu hamburguer");
      break;
    case 3 : System.out.println("Voce escolheu hotdog");
      break;
      default : System.out.println("Opcao nao cadastrada");

}
}
}