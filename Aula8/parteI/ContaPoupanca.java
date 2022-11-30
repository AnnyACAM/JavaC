package Aula8.parteI;
import Aula8.parteI.c_abstrat.Conta;

public class ContaPoupanca extends Conta {
   
    public void atualiza( double taxa) {
    this.saldo += this.saldo * (taxa * 3);
    }

}