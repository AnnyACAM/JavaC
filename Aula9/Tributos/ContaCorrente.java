public class ContaCorrente extends Conta {
    
    public void atualiza( double taxa) {
    this .saldo += this .saldo * (taxa * 2);
    }

    public void setDeposita( double valor) {
    this .saldo += valor - 0.10;
    }

    public double taxas(){
        double taxas, tributo;
        tributo = calculaTributos(this.saldo);
        taxas = tributo + getTaxa();
        return taxas;
    }
}