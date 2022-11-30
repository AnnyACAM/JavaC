class Circulo implements AreaCalculavel {
    public static final int pi = 3;
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calculaArea(){
        double area;
        area = 2 * pi * (this.getRaio());
        return area;
    }

    public void Area(double raio){
        double area;
        setRaio(raio);
        area = calculaArea();
        System.out.println("Area do circulo de raio " + getRaio() + " e igual a " + area);
    }
}
