import  java.util.ArrayList;
import java.util.Scanner;

public class Agenda{
    private int qntd_amigos = 0;
    private int qntd_conhecidos = 0; 
    private int qntd_pessoas = 0; 
    private static final int max_pessoas = 10;
    Pessoa pessoas[] = new Pessoa[max_pessoas];
    private ArrayList<Integer> index = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);

    public int getQntd_amigos() {
        return qntd_amigos;
    }

    public int getQntd_conhecidos() {
        return qntd_conhecidos;
    }

    public int getQntd_pessoas() {
        return qntd_pessoas;
    }
 
    public void Pessoas_Agenda(int n_pessoas){
        this.qntd_pessoas = n_pessoas;
        for(int i = 0; i < qntd_pessoas; i++){
            int opcao;
            opcao = 1 + (int) (Math.random() * 2);
            if(opcao == 1){
                pessoas[i] = new Amigo();
                index.add(opcao);
                this.qntd_amigos++;
            }
             if(opcao == 2){
                pessoas[i] = new Conhecido();
                index.add(opcao);
                this.qntd_conhecidos++;
            }
        }
    }

    public void addInformacoes(){
        String nome, email;
        int idade;
        int aniversario[] = new int[3];

        for(int i = 0; i < index.size(); i++){
            if(index.get(i) == 1){
                System.out.println("\nCadastra AMIGO");
                System.out.print("Nome:");
                nome = scan.next();
                System.out.print("Idade:");
                idade = scan.nextInt();
                System.out.println("Data Aniversario");
                System.out.print("Dia:");
                aniversario[0] = scan.nextInt();
                System.out.print("Mes:");
                aniversario[1] = scan.nextInt();
                System.out.print("Ano:");
                aniversario[2] = scan.nextInt();
                if ( pessoas[i] instanceof Amigo ){
                ((Amigo)pessoas[i]).cadastra_Amigo(nome, idade, aniversario);;
                }
            }
            if(index.get(i) == 2){
                System.out.println("\nCadastra CONHECIDO");
                System.out.print("Nome:");
                nome = scan.next();
                System.out.print("Idade:");
                idade = scan.nextInt();
                System.out.print("Email:");
                email = scan.next();
                if (pessoas[i] instanceof Conhecido ){
                    ((Conhecido)pessoas[i]).cadastra_Conhecido(nome, idade, email);;
                }
            }
        }
    }

    public void imprimeAniversario(){
        System.out.print("AMIGOS \n");
        for(int i = 0; i < index.size(); i++){
            if(index.get(i) == 1){
                ((Amigo)pessoas[i]).imprimeAmigo();
                System.out.println();
            }
        }
    }

    public void imprimeEmail(){
        System.out.print("CONHECIDOS \n");
        for(int i = 0; i < index.size(); i++){
            if(index.get(i) == 2){
                ((Conhecido)pessoas[i]).imprimeConhecido();
                System.out.println();
            }
        }
    }

    public void imprimeAgenda(){
        System.out.println("\nAmigos:" +qntd_amigos + "     Conhecidos:" +qntd_conhecidos+ "\n");
        for(int i = 0; i < index.size(); i++){
            if(index.get(i) == 1){
                ((Amigo)pessoas[i]).imprimeAmigo();
                System.out.println();
            }
            if(index.get(i) == 2){
                ((Conhecido)pessoas[i]).imprimeConhecido();
                System.out.println();
            }
         }
    }

}