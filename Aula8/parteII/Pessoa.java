public abstract class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(){
        this.nome = "ÒindefinidoÓ";
        this.idade = 0;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}