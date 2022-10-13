/*  2 - Modelo UML como classe Java
    3 - Método mostra()*/

public class Etapa1{
    
  public static void main(String args[]){
    //Cria objeto
    Funcionario Funcionario1;
    Funcionario1 = new Funcionario();

    Funcionario1.nome = "Renata";
    Funcionario1.departamento = "Administrativo";
    Funcionario1.salario = 3000;
    Funcionario1.dataEntrada = "10/10/2022";
    Funcionario1.RG = "MG-12.345.678";

    System.out.println(Funcionario1.mostra());
    
}
}