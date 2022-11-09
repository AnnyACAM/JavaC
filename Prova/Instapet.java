class Instapet{
    Usuario users[] = new Usuario[3];

    void cadastra_usuario(String nome, String email){
        int qnt_ux = 0;
        qnt_ux = qnt_usuarios();
        users[qnt_ux] = new Usuario();
        users[qnt_ux].setNome(nome);
        users[qnt_ux].setEmail(email);
    }

    void cadastra_foto(String link, String email,String desc){
        int indc_ux = 0;
        indc_ux = email_indice(email);
        users[indc_ux].cadastra_foto(link, desc);
    }

    int qnt_pets(String email){
        int indc_ux = 0;
        int quantd = 0;
        indc_ux = email_indice(email);
        if(indc_ux > 0){
        for(int i = 0; i < users[indc_ux].getImagem().length; i++){
        if (users[indc_ux].getImagem()[i] == null){
            quantd++;
        }
    }
        quantd = users[indc_ux].getImagem().length - quantd;
        return quantd;
    }
    return -1;
    }
    

    public int qnt_usuarios(){
        int quantd = 0;
        for(int i = 0; i < users.length; i++){
        
            if (users[i] == null){
                quantd++;
            }
        }
        
        quantd = users.length - quantd;
        return quantd;
    }

    Fotos[] listar_pets(String email){
        int indc_ux = 0;
        indc_ux = email_indice(email);

        return users[indc_ux].getImagem();
    }

    void mostra_pets(Fotos u[], int tam){
        for (int i = 0; i < tam; i++){
            System.out.print("\nDescricao:");
            System.out.println(u[i].getDescricao());
            System.out.print("Link:");
            System.out.println(u[i].getUrl());
        }
    }

    Usuario[] listar_usuarios(){
        return users;
    }

    void mostra_usuarios(Usuario us[], int tam){
        for (int i = 0; i < tam; i++){
            System.out.print("\nEmail:");
            System.out.println(us[i].getEmail());
            System.out.print("Nome:");
            System.out.println(us[i].getNome());
        }
    }

    void altera_descricao(int n,String email, String desc){
        int indc_ux = 0;
        indc_ux = email_indice(email);
        users[indc_ux].altera_descricao(n, desc);
    }

    public int email_indice(String email){
        int indice = 0;
        
        for(int i = 0; i < this.qnt_usuarios(); i++){
        if (email.equals(users[i].getEmail())){
            indice = i;
            return indice;
         } 
        }
        return -1;
    }

    int existeEmail(String email){
        for(int i = 0; i < this.qnt_usuarios(); i++)
            if (email.equals(users[i].getEmail())){
                return 1;
             } 
             return 0;
    }
   
}