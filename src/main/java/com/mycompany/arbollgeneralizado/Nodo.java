package com.mycompany.arbollgeneralizado;

public class Nodo {

    private Nodo liga;
    private Nodo ls;
    private char dato;

    public Nodo(char dato) {
        this.dato = dato;
        this.ls = null;
        this.liga = null;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

    public Nodo getLs() {
        return ls;
    }

    public void setLs(Nodo ls) {
        this.ls = ls;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

}
