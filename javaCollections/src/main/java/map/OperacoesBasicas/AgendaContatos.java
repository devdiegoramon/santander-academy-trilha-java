package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos

    private final Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Witoria", 819999999);
        agendaContatos.adicionarContato("Witoria amor", 829999999);
        agendaContatos.adicionarContato("Witoria paixão", 839999999);
        agendaContatos.adicionarContato("Witoria bebê", 849999999);
        agendaContatos.adicionarContato("Diego", 859999999);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Witoria bebê");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Witoria amor"));
    }
}
