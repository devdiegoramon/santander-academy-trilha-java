package main.java.map.Ordenacao;

import main.java.map.OperacoesBasicas.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    //atributos

    private Map<LocalDate, Evento> eventosMaps;

    public AgendaEventos() {
        this.eventosMaps = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
//        Evento evento = new Evento(nome, atracao);
        eventosMaps.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMaps);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
//        Set<LocalDate> dateSet = eventosMaps.keySet();
//        Collection<Evento> values = eventosMaps.values();
//        eventosMaps.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMaps);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 29), "SENAC", "AULA MAGNA");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 30), "PORTO+", "WORKSHOP");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JANUARY, 10), "PMSP", "CONCURSO");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}
