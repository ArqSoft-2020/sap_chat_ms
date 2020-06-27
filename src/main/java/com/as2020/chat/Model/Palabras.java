package com.as2020.chat.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Palabras {
    @Id
    private String idsala;

    @Column(name = "palabra", length = 50)
    private String palabra;

    public String getIdsala() {
        return idsala;
    }

    public void setIdsala(String idsala) {
        this.idsala = idsala;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
}
