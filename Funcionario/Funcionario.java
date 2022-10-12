
public class Funcionario{
    String nome = " ";
    String departamento = " ";
    double salario = 0.00;
    String data_in_banco= " ";
    String RG = " ";

    public static void main(String args[]){
    //Cria objeto
    Funcionario Funcionario1;
    Funcionario1 = new Funcionario();

    Funcionario1.nome = "Renata";
    Funcionario1.departamento = "Administrativo";
    Funcionario1.salario = 3000;
    Funcionario1.data_in_banco = "10/10/2022";
    Funcionario1.RG = "MG-12.345.678";

    System.out.println(Funcionario1.nome);
    System.out.println(Funcionario1.departamento);
    System.out.println(Funcionario1.salario);
    System.out.println(Funcionario1.data_in_banco);
    System.out.println(Funcionario1.RG);
}
}
