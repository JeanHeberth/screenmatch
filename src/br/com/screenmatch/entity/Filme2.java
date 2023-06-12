package br.com.screenmatch.entity;

import java.time.LocalDate;
import java.util.Calendar;

public class Filme2 {
    Calendar hoje = Calendar.getInstance();
    int hoje2 = LocalDate.now().getYear();
    LocalDate anoAtual = LocalDate.now();

    private String nome = "Top gun Maverick";
    private int anoDoLancamento = 1922;
    private int duracaoEmMinutos = 180;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int idade;
    private boolean lancamento;


    public String getNome() {
        return nome;
    }

    public int getAnoDoLancamento() {
        return anoDoLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isLancamento() {
        return lancamento;
    }

    public void avaliacao(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalAvaliacoes;
    }

    public int pegaIdade(){
        idade = anoAtual.getYear() - anoDoLancamento;
        return idade;
    }

    public String lancamento() {
    this.getIdade();
    return  idade <= 5?"Incluso":"Nao incluso";

    }

}

