package Aula9.Tributos;
abstract class SeguroDeVida implements Tributavel{
    private static final int taxa = 42;
    
    public static int getTaxa() {
        return taxa;
    }

    public double calculaTributos(double saldo){
        double tributo;
        tributo = saldo * 0.01;
        return tributo;
    }

    abstract double taxas();
}