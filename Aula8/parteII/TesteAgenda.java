public class TesteAgenda{
    
    public static void main(String[] args) {
    Agenda agenda = new Agenda();
    //Quantidade de pessoas na Agenda
    agenda.Pessoas_Agenda(4);
    //Adiciona Informações
    System.out.println("Cadastra Pessoas"); 
    agenda.addInformacoes();
    System.out.println("--------------------------------------");
    //Imprime Informações
    System.out.println("Número de pessoas na Agenda: " + agenda.getQntd_pessoas()); 
    System.out.println("--------------------------------------");
    
    System.out.println("Imprime Agenda"); 
    agenda.imprimeAgenda();
    System.out.println("--------------------------------------");

    if(agenda.getQntd_amigos() > 0){
    System.out.println("\nImprime Amigos\nQuantidade Amigos: "+ agenda.getQntd_amigos()+"\n"); 
    agenda.imprimeAniversario();
    System.out.println("--------------------------------------");
    }
    if(agenda.getQntd_conhecidos() > 0){
    System.out.println("\nImprime Conhecidos\nQuantidade Conhecidos: "+agenda.getQntd_conhecidos()+"\n"); 
    agenda.imprimeEmail();
    System.out.println("--------------------------------------");
    }
    }
    
}