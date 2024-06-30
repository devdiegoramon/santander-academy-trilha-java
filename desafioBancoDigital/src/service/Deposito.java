package service;

import model.Conta;

public class Deposito {
    public void realizarDeposito(Conta conta, double valor) {
        conta.depositar(valor);
        System.out.println("Depósito de R$" + valor + " realizado na conta " + conta.getNumero() + " com sucesso!");
    }
}
