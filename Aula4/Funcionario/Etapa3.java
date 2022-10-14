/*  6 - Modificação do tipo do atributo data de entrada por campos int
    Coleta de dados diretamente do usuário(funcionário)

    7 - Modificação do método mostra*/ 

import java.util.Scanner;

public class Etapa3{
    
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    
    //Cria objeto
    Funcionario Funcionario4;
    Funcionario4 = new Funcionario();

     System.out.println("Funcionario inclua seus dados");
     System.out.println("Nome:");
     Funcionario4.nome = input.next();
     System.out.println("Departamento:");
     Funcionario4.departamento = input.next();
     System.out.println("Salário:");
     Funcionario4.salario = input.nextInt();
     System.out.println("RG:");
     Funcionario4.RG = input.next();
     System.out.println("Data de Entrada:");
     int dia, mes, ano;
     System.out.print("Dia: ");
     dia = input.nextInt();
     Funcionario4.dataDeEntrada[0] = dia;
     System.out.print("Mês: ");
     mes = input.nextInt();
     Funcionario4.dataDeEntrada[1] = mes;
     System.out.print("Ano: ");
     ano = input.nextInt();
     Funcionario4.dataDeEntrada[2] = ano;
    
    System.out.print("\n\n");

    System.out.println(Funcionario4.Mostra());
    input.close();
}
}