package view;

import model.Banco;
import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.Scanner;

public class GerenciamentoContas {
    private final Banco banco;
    private final Scanner scanner;

    public GerenciamentoContas(Banco banco, Scanner scanner) {
        this.banco = banco;
        this.scanner = scanner;
    }

    public void criarContaCorrente() {
        System.out.println("Criando Conta Corrente...");
        System.out.print("Nome do Cliente: ");
        String nome = scanner.next();
        System.out.print("CPF do Cliente: ");
        String cpf = scanner.next();
        Cliente cliente = new Cliente(nome, cpf);
        int numeroConta = banco.gerarNumeroConta();
        int numeroAgencia = banco.getNumeroAgencia();
        ContaCorrente contaCorrente = new ContaCorrente(numeroConta, numeroAgencia, cliente);
        banco.adicionarConta(contaCorrente);
        System.out.println("Conta Corrente criada com sucesso!");
        System.out.println("Agência: " + numeroAgencia + " Conta: " + numeroConta);
    }

    public void criarContaPoupanca() {
        System.out.println("Criando Conta Poupança...");
        System.out.print("Nome do Cliente: ");
        String nome = scanner.next();
        System.out.print("CPF do Cliente: ");
        String cpf = scanner.next();
        Cliente cliente = new Cliente(nome, cpf);
        int numeroConta = banco.gerarNumeroConta();
        int numeroAgencia = banco.getNumeroAgencia();
        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, numeroAgencia, cliente);
        banco.adicionarConta(contaPoupanca);
        System.out.println("Conta Poupança criada com sucesso!");
        System.out.println("Agência: " + numeroAgencia + " Conta: " + numeroConta);
    }
}
