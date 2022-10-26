
public class Funcionario{
    String nome = " ";
    String departamento = " ";
    double salario = 0.00;
    String dataEntrada= " ";
    int dataDeEntrada[] = new int[3];
    String RG = " ";
    
    //Etapa 1
    String mostra(){
        String info;info = "Nome: " + this.nome;
            
			info += "\nDepartamento: " + this.departamento;
			info += "\nSalário: " + this.salario;
			info += "\nData de Entrada no Banco: R$" + this.dataEntrada;
			info += "\nRG: " + this.RG;
			return info;
    }

    //Etapa 3
    String Mostra(){
        String info;
            info = "Nome: " + this.nome;
			info += "\nDepartamento: " + this.departamento;
			info += "\nSalário: " + this.salario;
            
			info += "\nData de Entrada no Banco:" + this.dataDeEntrada[0] + "/" + this.dataDeEntrada[1] + "/" + this.dataDeEntrada[2];
			info += "\nRG: " + this.RG;
			return info;
    }
}
