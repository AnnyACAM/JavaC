import java.util.Arrays;

public class Empresa{
        String cnpj = " ";
        Funcionario empregados[] = new Funcionario[1];
        String nome = " ";
        private int nFuncionarios = 0;

        public void adiciona(Funcionario f){
            if(nFuncionarios+1 > empregados.length){
                empregados = Arrays.copyOf(empregados, nFuncionarios+1);
            }
            empregados[nFuncionarios] = f;
            nFuncionarios++;
        }      
        
        String imprime(){
            String info;
            info = "Nome: " + this.nome;
            info += "\nCNPJ: " + this.cnpj;
            info += "\n Número Funcionario:" + this.nFuncionarios;

            return info;
        }
        
}
