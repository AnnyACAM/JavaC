class Main{
    public static void main(String args[]){

        //Cria objeto casa
        Casa lar = new Casa();
        
        //Adicona cor da casa
        lar.pinta("Cinza Chumbo");
        
        //Cria porta
        lar.adicionaPorta();
        lar.portas[0].estado = true;

        //Mostra Casa
        lar.mostra_casa();

    }
}