class Quadrado implements AreaCalculavel {
    private double aresta;
    
    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public double calculaArea(){
        double area;
        area = this.aresta * this.aresta;
        return area;
    }

    public void Area(double aresta){
        double area;
        setAresta(aresta);
        area = calculaArea();
        System.out.println("Area do quadrado de aresta " + getAresta() + " e igual a " + area);
    }
}