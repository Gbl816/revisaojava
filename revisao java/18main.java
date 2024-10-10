import java.util.Scanner;
// att estacao
public class Main {
  public static void main(String[] args) {
    Scanner ma = new Scanner(System.in);
   String estacao;
    System.out.println("Digite o codigo de estacao:");
    estacao = ma.nextLine();
    
  switch(estacao){
    case "1" : System.out.println("Voce escolheu verao");
      break;
    case "2" : System.out.println("Voce escolheu inverno");
      break;
    case "3" : System.out.println("Voce escolheu outono");
      break;
      case "4" : System.out.println("Voce escolheu primavera");
      break;
      default : System.out.println("opcao invalida");

}
}
}
