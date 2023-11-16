package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class VooDelta extends Voo {

    private int capacidadePassageiros;

    public VooDelta(String numeroVoo, String origem, String destino, String dataPartida, int capacidadePassageiros){
        super(numeroVoo, origem, destino, dataPartida);
        this.capacidadePassageiros = capacidadePassageiros;

    }

    public int getCapacidadePassageiros(){
        return capacidadePassageiros;
    }
}
