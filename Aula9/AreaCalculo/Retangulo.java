class Retangulo implements AreaCalculavel{
    private double altura;
    private double largura;

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return largura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double calculaArea(){
        double area;
        area = this.altura * this.largura;
        return area;
    }

    public void Area(double altura, double largura){
        double area;
        setAltura(altura);
        setLargura(largura);
        area = calculaArea();
        System.out.println("Area do retangulo de altura " + getAltura() + " e largura " + getLargura() +" e igual a " + area);
    }
}