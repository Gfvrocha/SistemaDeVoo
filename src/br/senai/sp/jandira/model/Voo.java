package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.List;

abstract class Voo {

    private String numeroVoo, origem, destino;
    private String dataPartida;

    public Voo(String numeroVoo, String origem, String destino, String dataPartida){
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataPartida = dataPartida;

    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    //Aplicando Polimorfismo
    public abstract int getCapacidadePassageiros();
}
