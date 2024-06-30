package service;

import model.Conta;

public class Saque {
    public void realizarSaque(Conta conta, double valor) {
        conta.sacar(valor);
        System.out.println("Saque de R$" + valor + " realizado na conta " + conta.getNumero() + " com sucesso!");
    }
}
