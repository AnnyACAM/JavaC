public class Usuario {
    private String nome;
    private String email;
    private Fotos imagem[] = new Fotos[3];
    
    //Get
    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    public Fotos[] getImagem(){
        return this.imagem;
    }
    
    //Set
    public void setNome(String novaNome){
        this.nome = novaNome;
    }
    public void setEmail(String novaEmail){
        this.email = novaEmail;
    }
    public void setImagem (Fotos[] novaImagem){
        this.imagem = novaImagem;
    }

    void cadastra_foto(String link, String desc){
        int qnt_img = 0;
        qnt_img = qnt_fotos();
        imagem[qnt_img] = new Fotos();
        imagem[qnt_img].setDescricao(desc);
        imagem[qnt_img].setUrl(link); 
    }

    void altera_descricao(int n, String desc){
        imagem[n].setDescricao(desc);
    }

    int qnt_fotos(){
        int quantd = 0;
        for(int i = 0; i < imagem.length; i++){
        if (imagem[i] == null){
            quantd++;
        }
    }
    quantd = imagem.length - quantd;
        return quantd;
    }

}