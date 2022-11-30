package Aula8.parteI;

public class TestaContas {
 public static void main(String[] args)
 {
     ContaCorrente cc = new ContaCorrente();
     ContaPoupanca cp = new ContaPoupanca();

     cc.setDeposita(100.00);
     cp.setDeposita(100.00);

     cc.atualiza(0.01);
     cp.atualiza(0.01);

     double saldo_cc, saldo_cp;
     saldo_cc = cc.getSaldo();
     System.out.println("Saldo Conta Corrente = R$"+ saldo_cc);
     saldo_cp = cp.getSaldo();
     System.out.println("Saldo Conta Poupanca = R$"+ saldo_cp);
     
 }
}