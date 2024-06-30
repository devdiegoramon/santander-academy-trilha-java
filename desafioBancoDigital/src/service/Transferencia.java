package service;

import model.Conta;

public class Transferencia {
    public void realizarTransferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        if (contaOrigem.getSaldo() >= valor) {
            contaOrigem.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " da conta " + contaOrigem.getNumero() + " para a conta " + contaDestino.getNumero() + " realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente na conta de origem!");
        }
    }
}
