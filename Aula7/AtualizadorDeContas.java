
public class AtualizadorDeContas {
 private double total = 0.00;
 private double selic;

 public AtualizadorDeContas(double selic)
 {
     this.selic = selic;
 }

 public void roda(Conta C)
 {
     System.out.println("Saldo Anterior: " + C.getSaldo());
     C.atualiza(this.selic);
     total = C.getSaldo();   
     System.out.println("Saldo Atual: " + total);     
 }

 }
