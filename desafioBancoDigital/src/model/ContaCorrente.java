package model;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numeroConta, int numeroAgencia, Cliente cliente) {
        super(numeroConta, numeroAgencia, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
