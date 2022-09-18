package com.example.testetutorial.controller;

import com.example.testetutorial.model.Evento;


import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class EventoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Evento evento;

    private List<Evento> eventos = new ArrayList<>();

    public EventoBean() {
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public String addEvento(){
        eventos.add(evento);
        System.out.println("evento realizado: " + evento.getNome());
        clean();

        return null;
    }

    private void clean() {
        this.evento = new Evento();
    }
}
