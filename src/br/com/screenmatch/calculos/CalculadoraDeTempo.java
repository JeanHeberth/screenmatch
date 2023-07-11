package br.com.screenmatch.calculos;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.time.Duration;

public class CalculadoraDeTempo {


    private int tempoTotal;
    private double tempoTotalTest;

    public double getTempoTotalTest() {
        return tempoTotalTest;
    }

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme filme) {
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie serie) {
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public void conversaoMinutosParaHora(){
        this.tempoTotalTest = (double) tempoTotal / 60;
    }



}
