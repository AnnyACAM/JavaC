import java.util.Scanner;

class Main{

    public static void main(String args[]){
        Scanner scanf = new Scanner(System.in);
    //Observações: vetores de usuário e fotos possuem 3 de tamanho

        //Inicializando classe instapet
        Instapet insta = new Instapet();

        //Quantidade de Usuário "logados"
            
        int opc = 1;
   

        while(opc > 0 && opc <8){
        
        System.out.println("1 - Adicionar Usuario\n2 - Adicionar Pet\n3 - Listar usuarios \n4 - Listar Pets\n5 - Quantidade Pets\n6 - Quantidade Usuarios\n7 - Mudar descricao\n0 - Sair");
        opc = scanf.nextInt();
        if(opc == 1)
        {
            if(insta.qnt_usuarios() < 3){
            String email;
            String nome;
            System.out.println("\n> ADICIONAR USUARIO");
            System.out.print("email:");
            email = scanf.next();
                if(insta.existeEmail(email) == 0){
                System.out.print("nome:");
                nome = scanf.next();
                insta.cadastra_usuario(nome, email);
                }
                else{
                    System.out.println("Email já cadastrado");
                }
            }
            else{
                System.out.println("Maximo de Usuarios Inclusos");
            }
            
        }

        if(opc == 2)
        {
       
            String email;
            String link;
            String descr;
            System.out.println("\n> ADICIONAR PETS");
            System.out.print("email:");
            email = scanf.next();
            if(insta.qnt_pets(email) < 3){
            if(insta.existeEmail(email) == 1){
            System.out.print("link:");
            link = scanf.next();
            System.out.print("desc:");
            descr = scanf.next();
                insta.cadastra_foto(link, email, descr);
                }  else{
                    System.out.println("Email não cadastrado");
                }
             }  else
            {
                System.out.println("Maximo de Imagens Inclusas");
            }
        }

        if(opc == 3)
        { 
            //Objeto Usuarios
            Usuario aux[] = new Usuario[insta.qnt_usuarios()];
            for(int i = 0; i < insta.qnt_usuarios(); i++)
                aux[i] = new Usuario();

            //Lista Usuarios
            System.out.println("\n> LISTAR USUARIOS");
            aux = insta.listar_usuarios();
            insta.mostra_usuarios(aux, insta.qnt_usuarios());

        }

        if(opc == 4)
        {
            String email=" ";
            int qntd_img = 0;
            
            System.out.println("\n> LISTAR PETS");
            System.out.print("email:");
            email = scanf.next();
            qntd_img = insta.qnt_pets(email);
            System.out.println(insta.qnt_pets(email));
            if(insta.existeEmail(email) == 1){
            
                    //Cria novo objeto auxiliar para fotos
                    Fotos aux[] = new Fotos[qntd_img];
                    for(int i = 0; i < qntd_img; i++)
                        aux[i] = new Fotos();

                    System.out.println("Usuario " +email);
                    //Lista Fotos
                    aux = insta.listar_pets(email);
                    //Imprime Fotos
                    insta.mostra_pets(aux, qntd_img);
                
            }
            else { 
                System.out.println("Email não cadastrado");
            }
        }

        if(opc == 5)
        {
            String email=" ";
            int qnt_img = 0;
            
            System.out.println("\n> QUANTIDADE PETS");
            System.out.print("email:");
            email = scanf.next();
            if(insta.existeEmail(email) == 1)
            {
                qnt_img = insta.qnt_pets(email);

                System.out.println(+qnt_img);
            }
            else {
                 System.out.println("Email não cadastrado");
            }
        }

        if(opc == 6)
        {
            System.out.println("\n> QUANTIDADE USUARIOS");
            System.out.println(insta.qnt_usuarios());
        }

        if(opc == 7)
        {
            String email;
            String descr;
            int i;
            System.out.println("\n> ALTERA DESCRICAO");
            System.out.print("email:");
            email = scanf.next();
            if(insta.existeEmail(email) == 1)
            {
                System.out.print("indice foto:");
                i = scanf.nextInt();

                System.out.print("nova descricao:");
                descr = scanf.next();

                if(i > -1 && i < 3){
                insta.altera_descricao(i, email, descr);
                }else{
                    System.out.print("Indice Foto Incorreto");
                }
            }
            else {
                System.out.println("Email não cadastrado");
            }
        }
    }

       scanf.close();
    }
}