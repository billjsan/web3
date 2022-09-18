package com.example.testetutorial.model;

import java.io.Serializable;

public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private String email;

    public Evento() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
