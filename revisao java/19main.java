import java.util.Scanner;
//att swirtch qntd e codigo
public class Main {
  public static void main(String[] args) {
    Scanner ma = new Scanner(System.in);
   int codigo, quantidade;
    System.out.println("Digite o codigo e a quantidade do produto desejado:");
    codigo = Integer.parseInt(ma.nextLine());
    quantidade = Integer.parseInt(ma.nextLine());
    switch(codigo){
      case 1: System.out.println("O preco do seu hot dog ficou em:" + quantidade * 3.0);
        break;
        case 2: System.out.println("O preco do seu hamburguer ficou em:" + quantidade * 4.5);
        break;
        case 3: System.out.println("O preco da ssua pizza ficou em:" + quantidade * 5.0);
        break;
        case 4: System.out.println("O preco do seu refrigerante ficou em:" + quantidade * 2.0);
        break;
      default: System.out.println("opcao invalida");
    }
    

}

}