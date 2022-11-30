public class Conhecido extends Pessoa{
    private String email = "ÒindefinidoÓ";

    public Conhecido(){
        this.email = "ÒindefinidoÓ";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void cadastra_Conhecido(String nome, int idade,String email){
        this.setNome(nome);
        this.setIdade(idade);
        this.setEmail(email);
    }

    public void imprimeConhecido(){
        String nome, email;
        int idade;
        nome = this.getNome();
        idade = this.getIdade();
        email = this.getEmail();
        System.out.println(nome + "   |   " +idade+ " anos");
        System.out.println("> Email:" +email);
    }
}