class TestaTributavel{
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        double saldo = 100.0;
        cc.setDeposita(saldo);
        cp.setDeposita(saldo);
        cc.setSaca(cc.taxas());
        cp.setSaca(cp.taxas());
        System.out.println("Conta Corrente");
        System.out.println("Saldo anterior: " + saldo +"\nSaldo Atual(com taxas): " + cc.getSaldo());
        System.out.println("-------------------------------------");
        System.out.println("Conta Poupanaca");
        System.out.println("Saldo anterior: " + saldo +"\nSaldo Atual(com taxas): " + cp.getSaldo());
    }
}