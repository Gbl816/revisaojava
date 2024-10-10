import java.util.Scanner;
//att salario
public class Main {
  public static void main(String[] args) {
    Scanner ma = new Scanner(System.in);
    Double salario, percentual, aumento, novoSalario;
    System.out.println("Digite o seu salario: ");
    salario = Double.parseDouble(ma.nextLine());
    if(salario<=2800){
      percentual = 0.2;
      aumento = salario*percentual;
      novoSalario = salario + aumento;
      
      System.out.printf(" O seu salario antes do reajuste e de: %.2f ", salario);
      
     System.out.printf("\n O seu salario aumentou em 20 porcento oque da: %.2f", aumento);
      
      System.out.printf("\n O seu salario apos o aumento e de: %.2f ", novoSalario);
    }else if(salario>2800 && salario<=7000){
      percentual = 0.15;
      aumento = salario*percentual;
      novoSalario = salario + aumento;

      System.out.printf(" O seu salario antes do reajuste e de: %.2f ", salario);

     System.out.printf("\n O seu salario aumentou em 15 porcento oque da: %.2f", aumento);

      System.out.printf("\n O seu salario apos o aumento e de: %.2f ", novoSalario);

    } else if(salario>7000 && salario<=15000){
      percentual = 0.1;
      aumento = salario*percentual;
      novoSalario = salario + aumento;

      System.out.printf(" O seu salario antes do reajuste e de: %.2f ", salario);

     System.out.printf("\n O seu salario aumentou em 10 porcento oque da: %.2f", aumento);

      System.out.printf("\n O seu salario apos o aumento e de: %.2f ", novoSalario);

  
}else{
      percentual = 0.05;
      aumento = salario*percentual;
      novoSalario = salario + aumento;
      System.out.printf(" O seu salario antes do reajuste e de: %.2f ", salario);

     System.out.printf("\n O seu salario aumentou em 5 porcento oque da: %.2f", aumento);

      System.out.printf("\n O seu salario apos o aumento e de: %.2f ", novoSalario);
    }
  }
}