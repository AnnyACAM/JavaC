public class Principal{

 
    public static void main(String args[]){
        Empresa AB = new Empresa();
        AB.nome = "Ab";
        AB.empregados[0] = new Funcionario();
        AB.adiciona(AB.empregados[0]);
        AB.empregados[0].nome = "AA0";

        System.out.println(AB.empregados[0].mostra());
        System.out.println(AB.imprime());

    }

    
}
