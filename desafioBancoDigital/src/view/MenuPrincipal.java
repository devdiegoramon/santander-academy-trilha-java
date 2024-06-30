package view;

import model.Banco;
import model.Cliente;
import model.Conta;
import service.Deposito;
import service.Saque;
import service.Transferencia;

import java.util.Scanner;

public class MenuPrincipal {
    private final Banco banco;
    private final Scanner scanner;
    private final GerenciamentoContas gerenciamentoContas;
    private final Deposito deposito;
    private final Saque saque;
    private final Transferencia transferencia;

    public MenuPrincipal() {
        this.banco = new Banco("Meu Banco");
        this.scanner = new Scanner(System.in);
        this.gerenciamentoContas = new GerenciamentoContas(banco, scanner);
        this.deposito = new Deposito();
        this.saque = new Saque();
        this.transferencia = new Transferencia();
    }

    public void exibirMenu() {
        int opcao = 0;
        do {
            System.out.println("Menu Principal");
            System.out.println("1. Criar Conta");
            System.out.println("2. Você já tem uma conta");
            System.out.println("3. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exibirMenuCriarConta();
                    break;
                case 2:
                    exibirMenuOperacoes();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }

    private void exibirMenuCriarConta() {
        int opcao = 0;
        do {
            System.out.println("Criar Conta");
            System.out.println("1. Conta Corrente");
            System.out.println("2. Conta Poupança");
            System.out.println("3. Voltar");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gerenciamentoContas.criarContaCorrente();
                    break;
                case 2:
                    gerenciamentoContas.criarContaPoupanca();
                    break;
                case 3:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }

    private void exibirMenuOperacoes() {
        int opcao = 0;
        do {
            System.out.println("Operações");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Voltar");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    realizarDeposito();
                    break;
                case 2:
                    realizarSaque();
                    break;
                case 3:
                    realizarTransferencia();
                    break;
                case 4:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }

    private void realizarDeposito() {
        System.out.print("Número da Conta: ");
        int numero = scanner.nextInt();
        Conta conta = banco.buscarContaPorNumero(numero);
        if (conta != null) {
            System.out.print("Valor do Depósito: ");
            double valor = scanner.nextDouble();
            deposito.realizarDeposito(conta, valor);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    private void realizarSaque() {
        System.out.print("Número da Conta: ");
        int numero = scanner.nextInt();
        Conta conta = banco.buscarContaPorNumero(numero);
        if (conta != null) {
            System.out.print("Valor do Saque: ");
            double valor = scanner.nextDouble();
            saque.realizarSaque(conta, valor);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    private void realizarTransferencia() {
        System.out.print("Número da Conta de Origem: ");
        int numeroOrigem = scanner.nextInt();
        Conta contaOrigem = banco.buscarContaPorNumero(numeroOrigem);
        if (contaOrigem != null) {
            System.out.print("Número da Conta de Destino: ");
            int numeroDestino = scanner.nextInt();
            Conta contaDestino = banco.buscarContaPorNumero(numeroDestino);
            if (contaDestino != null) {
                System.out.print("Valor da Transferência: ");
                double valor = scanner.nextDouble();
                transferencia.realizarTransferencia(contaOrigem, contaDestino, valor);
            } else {
                System.out.println("Conta de destino não encontrada!");
            }
        } else {
            System.out.println("Conta de origem não encontrada!");
        }
    }
}
