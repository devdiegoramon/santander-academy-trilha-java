package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Banco {
    private String nome;
    private List<Conta> contas;
    private static final int NUMERO_AGENCIA = 1234; // Exemplo de número fixo para a agência

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public Conta buscarContaPorNumero(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public int gerarNumeroConta() {
        Random random = new Random();
        return 4000 + random.nextInt(1001);
    }

    public int getNumeroAgencia() {
        return NUMERO_AGENCIA;
    }
}
