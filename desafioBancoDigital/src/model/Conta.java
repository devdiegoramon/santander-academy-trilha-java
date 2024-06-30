package model;

public abstract class Conta implements IConta {
    protected int numeroConta;
    protected int numeroAgencia;
    protected double saldo;
    protected Cliente cliente;

    public Conta(int numeroConta, int numeroAgencia, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public int getNumero() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso na conta " + numeroConta);
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso na conta " + numeroConta);
            } else {
                System.out.println("Saldo insuficiente na conta " + numeroConta);
            }
        } else {
            System.out.println("Valor inválido para saque");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                contaDestino.depositar(valor);
                System.out.println("Transferência de R$" + valor + " realizada com sucesso da conta " + numeroConta + " para a conta " + contaDestino.getNumero());
            } else {
                System.out.println("Saldo insuficiente na conta " + numeroConta);
            }
        } else {
            System.out.println("Valor inválido para transferência");
        }
    }

    public void imprimirInfosComuns() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agência: " + this.numeroAgencia);
        System.out.println("Número: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }

    public abstract void imprimirExtrato();
}
