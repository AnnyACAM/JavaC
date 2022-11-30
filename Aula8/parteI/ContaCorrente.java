package Aula8.parteI;
import Aula8.parteI.c_abstrat.Conta;

public class ContaCorrente extends Conta {
    
    public void atualiza( double taxa) {
    this .saldo += this .saldo * (taxa * 2);
    }

    public void setDeposita( double valor) {
    this .saldo += valor - 0.10;
    }
}