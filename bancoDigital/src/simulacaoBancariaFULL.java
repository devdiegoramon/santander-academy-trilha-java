// BANCO DIGITAL | SIMULAÇÃO BANCARIA

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class simulacaoBancariaFULL {
    public static void main (String[] args) {
        Locale.setDefault (new Locale (
                "pt",
                "BR"
        ));
        // DADOS PRIMITIVOS
        Scanner scanner = new Scanner (System.in);
        double saldo = 0;
        boolean continuar = true;
        String[] opcoes = {"Depositar", "Sacar", "Consultar Saldo", "Encerrar"};
        // ENTRADA
        System.out.println ("Bem vindo ao Banco Virtual");
        // Opções do menu ao iniciar
        while (continuar) {
            for (int i = 0; i < opcoes.length; i++) {
                System.out.println ("opção " + (i + 1) + ". " + opcoes[i]);
            }
            // ESCOLHA DE OPÇÕES
            System.out.println ();
            System.out.print ("Escolha uma opção: ");
            try {
                int opcao = scanner.nextInt ();
                switch (opcao) {
                    case 1:
                        Double deposito;
                        System.out.println ("Qual valor a ser depositado: ");
                        deposito = scanner.nextDouble ();
                        System.out.println ("O depósito de R$" + deposito + " foi concluído com sucesso!");
                        saldo += deposito;
                        System.out.println ("O saldo atual é de R$ " + saldo + ".");
                        break;
                    case 2:
                        Double saque;
                        System.out.println ("Qual valor a ser sacado: ");
                        saque = scanner.nextDouble ();
                        if (saldo > saque) {
                            saldo -= saque;
                            System.out.println ("O saque de R$" + saque + " foi concluído com sucesso!");
                            System.out.println ("O saldo atual é de R$ " + saldo + ".");
                        }
                        else {
                            System.out.println ("Você não tem dinheiro suficiente na conta");
                            System.out.println ("O saldo atual é de R$ " + saldo + ".");
                        }
                        break;
                    case 3:
                        System.out.println ("O saldo atual é de R$ " + saldo + ".");
                        break;
                    case 4:
                        System.out.println ("Programa encerrado.");
                        continuar = false;
                        break;
                    default:
                        System.out.println ("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                for (int i = 0; i < 5; i++) {
                    System.out.println ();
                }
                System.out.println ("DEVE SER INSERIDO UM VALOR NÚMERICO COM VIRGULA");
                scanner.next ();
            }
        }
    }
}

