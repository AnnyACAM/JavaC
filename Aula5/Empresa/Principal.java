public class Principal{

 
    public static void main(String args[]){
        Empresa AB = new Empresa();
        AB.nome = "Ab";
        AB.cnpj = "12345678";
        AB.empregados[0] = new Funcionario();
        AB.empregados[0].nome = "Nana";
        AB.empregados[0].departamento = "Executivo";
        AB.empregados[0].salario = 1200;
        AB.empregados[0].dataEntrada = "03/10/2015";
        AB.empregados[0].RG = "MG-alguma.coisa";
        AB.adiciona(AB.empregados[0]);

        int quantd = 0;
        quantd = AB.qnt_funcionarios();
        System.out.println(AB.imprime());
        for(int i = 0; i < quantd; i++){
            System.out.println(AB.empregados[i].mostra());
        }

    }

    
}