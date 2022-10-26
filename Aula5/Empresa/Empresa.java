import java.util.Arrays;

public class Empresa{
        String cnpj = " ";
        Funcionario empregados[] = new Funcionario[1];
        String nome = " ";
        private int nFuncionarios = 0;

        public void adiciona(Funcionario f){
            if(nFuncionarios == empregados.length){
                Funcionario empregadosReserva[] = new Funcionario[15];
                System.arraycopy(empregados, 0, empregadosReserva, 0, empregados.length);
                empregados = empregadosReserva;
            }
            empregados[nFuncionarios] = f;
            nFuncionarios++;
        }      
        
        String imprime(){
            String info;
            info = "Nome: " + this.nome;
            info += "\nCNPJ: " + this.cnpj;
            info += "\nNúmero Funcionario:" + this.nFuncionarios;
            return info;
        }

}
