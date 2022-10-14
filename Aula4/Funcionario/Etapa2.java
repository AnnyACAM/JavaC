/*  Compração funcionários 
    4 - Funcionários com referências diferentes
    (Funcionario1  e Funcionario2)

    5 - Funcionários com mesmas referências
    (Funcionario1 e Funcionario3) 

Ou seja a comparação utilizando ´==´ não compara atributos mas sim endereços de memoria*/

public class Etapa2{
    
  public static void main(String args[]){
    //Cria objeto
    Funcionario Funcionario1;
    Funcionario1 = new Funcionario();
    Funcionario1.nome = "Renata";
    Funcionario1.departamento = "Administrativo";
    Funcionario1.salario = 3000;
    Funcionario1.dataEntrada = "22/02/2022";
    Funcionario1.RG = "MG-12.345.678";

    Funcionario Funcionario2;
    Funcionario2 = new Funcionario();
    Funcionario2.nome = "Renato";
    Funcionario2.departamento = "Executivo";
    Funcionario2.salario = 3000;
    Funcionario2.dataEntrada = "10/10/2022";
    Funcionario2.RG = "MG-87.654.321";

    if(Funcionario1 == Funcionario2){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }

    Funcionario Funcionario3;
    Funcionario3 = new Funcionario();
    Funcionario3 = Funcionario1;

    if(Funcionario1 == Funcionario3){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
}
}