class Casa{
    //Atributos
    String cor;
    int totalDePortas = 0; 
    Porta portas[] = new Porta[0];

    //Métodos:
    void mostra_casa(){
        int i;
        int abertas = this.quantasPortasEstaoAbertas();
        System.out.println("Cor:" +cor);
        System.out.println("Total de Portas:" + totalDePortas);
        System.out.println("Total de Portas abertas:" + abertas);
        for(i = 0; i < totalDePortas; i++){       
            System.out.printf("Porta [%d] = ",+i);
            portas[i].mostra_estado_porta();
        }
    }

    void pinta(String s){
        cor = s;
    }

    int quantasPortasEstaoAbertas(){
        int abertas = 0;
        for(int i = 0; i < portas.length; i++){
            if (portas[i].estado) abertas++; 
        }
        return abertas;
    }

    void adicionaPorta(){
        Porta nova = new Porta();
        Porta novas_portas[] = new Porta[this.totalPortas() + 1];

        for ( int i = 0; i < this.totalPortas(); i++) {
            novas_portas[i] = this.portas[i];            
        }

        novas_portas [this.totalPortas()] = nova;
        this.portas = novas_portas;
        this.totalDePortas ++;
    }

    int totalPortas(){
        int tot_portas = 0;
        
        for(int i = 0; i < this.portas.length; i++){
            if(portas[i] != null) tot_portas++;
        }
        
        return tot_portas;
    }

}
