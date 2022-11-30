public class TestaContas {
 public static void main(String[] args)
 {
     Banco banco = new Banco();
     AtualizadorDeContas atualiza = new AtualizadorDeContas(13.75);
    Conta c = new Conta();
     ContaCorrente cc = new ContaCorrente();
     ContaPoupanca cp = new ContaPoupanca();

     banco.adiciona(c);
     //banco.adiciona(cc);
     //banco.adiciona(cp);

     c.setDeposita(100.00);
     cc.setDeposita(100.00);
     cp.setDeposita(100.00);

     c.atualiza(0.01);
     cc.atualiza(0.01);
     cp.atualiza(0.01);

     for(int i =0; i < banco.pegaTotalContas(); i++){
        System.out.println("\nConta"+ i);
        atualiza.roda(banco.pegaConta(i));
     }

     double saldo_c, saldo_cc, saldo_cp;
     saldo_c = c.getSaldo();
     System.out.println("\nSaldo Conta = R$"+ saldo_c);
     saldo_cc = cc.getSaldo();
     System.out.println("Saldo Conta Corrente = R$"+ saldo_cc);
     saldo_cp = cp.getSaldo();
     System.out.println("Saldo Conta Poupanca = R$"+ saldo_cp);
     
 }
}