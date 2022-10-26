public class Principal{

 
    public static void main(String args[]){
        Empresa AB = new Empresa();
        AB.nome = "Ab";
        AB.cnpj = "12345678";
        AB.empregados[0] = new Funcionario();
        AB.adiciona(AB.empregados[0]);
        AB.empregados[0].nome = "AA0";

        AB.empregados[1] = new Funcionario();
        AB.adiciona(AB.empregados[1]);
        AB.empregados[1].nome = "BB";

        System.out.println(AB.imprime());
        for(int x = 0; x < AB.empregados.length; x++){
            System.out.println(AB.empregados[x].Mostra());
        }

    }

    
}