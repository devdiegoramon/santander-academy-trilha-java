package model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numeroConta, int numeroAgencia, Cliente cliente) {
        super(numeroConta, numeroAgencia, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
