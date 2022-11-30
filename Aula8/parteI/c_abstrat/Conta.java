package Aula8.parteI.c_abstrat;

public abstract class Conta{
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
      if (this.saldo < valor){
       this.saldo -= valor;
      }
    }

    //Deposita
    public void setDeposita(Double valor){
       this.saldo += valor;
    }

    //Atualiza
    public abstract void atualiza (double taxa);
}
