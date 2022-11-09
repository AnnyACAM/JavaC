public class Fotos{
    private String url;
    private String descricao;

    //Get
    public String getUrl(){
        return this.url;
    }
    public String getDescricao(){
        return this.descricao;
    }

    //Set
    public void setDescricao(String novadescricao){
        this.descricao = novadescricao;
    }

    public void setUrl(String novaurl){
        this.url = novaurl;
    }
}