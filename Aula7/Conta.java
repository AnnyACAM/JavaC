public class Conta{
    protected double saldo;

    // Get
    public double getSaldo(){
       return this.saldo; 
   }

    // Set
    public void setSaldo(Double novosaldo){
       this.saldo = novosaldo; 
   }

    //Saca
    public void setSaca(Double valor){
      if (valor < this.saldo){
       this.saldo -= valor;
      }
    }

    //Deposita
    public void setDeposita(Double valor){
       this.saldo += valor;
    }

    //Atualiza
    public void atualiza ( double taxa ) {
    this . saldo += this . saldo * taxa ;
   }
}