public class Funcionario{
    String nome = " ";
    String departamento = " ";
    double salario = 0.00;
    String dataEntrada = " ";
    String RG = " ";
    
    //Etapa 1
    String mostra(){
        String info;
            info = "\nNome: " + this.nome;
			info += "\nDepartamento: " + this.departamento;
			info += "\nSalário: R$ " + this.salario;
			info += "\nData de Entrada no Banco: " + this.dataEntrada;
			info += "\nRG: " + this.RG;
			return info;
    }

}
