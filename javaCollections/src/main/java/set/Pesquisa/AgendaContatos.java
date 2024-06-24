package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private final Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Witoria", 811111111);
        agendaContatos.adicionarContato("Witoria", 911111111);
        agendaContatos.adicionarContato("Witoria Larissa", 1111115111);
        agendaContatos.adicionarContato("Witoria amor", 1651515);
        agendaContatos.adicionarContato("Diego", 78944984);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Diego"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Diego", 711111111));

        agendaContatos.exibirContatos();
    }
}
