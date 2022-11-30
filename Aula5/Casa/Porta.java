class Porta{

    boolean estado = false;

    void mostra_estado_porta(){
        if(this.estado == true){
            System.out.println("Esta aberta");
        }
        else{
            System.out.println("Esta fechada");
        }
    }
    void novo_estado_porta(boolean e){
        this.estado = e;
            //True = Aberta
            //False = Fechada
    }
    

}