public class Amigo extends Pessoa{
    private int aniversario[] = new int[3];

    public Amigo(){
        this.aniversario[0] = 00;
        this.aniversario[1] = 00;
        this.aniversario[2] = 00;
    }

    public int[] getAniversario() {
        return aniversario;
    }

    public void setAniversario(int dia, int mes, int ano) {
        this.aniversario[0] = dia;
        this.aniversario[1] = mes;
        this.aniversario[2] = ano;
    }

    public void cadastra_Amigo(String nome, int idade,int aniver[]){
        this.setNome(nome);
        this.setIdade(idade);
        this.setAniversario(aniver[0], aniver[1], aniver[2]);
    }

    public void imprimeAmigo(){
        String nome;
        int idade;
        int niver[] = new int[3];
        nome = this.getNome();
        idade = this.getIdade();
        niver = this.getAniversario();
        System.out.println(nome + "   |   " +idade+ " anos");
        System.out.println("> Aniversario: " +niver[0]+ "/" +niver[1]+ "/" +niver[2]);
    }
}