package br.com.screenmatch.entity;

import java.time.LocalDate;

public class Filme2 {
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

    public int pegaIdade() {
       return this.idade = anoAtual.getYear() - anoDoLancamento;
    }

    public String informaLancamento() {
        return idade <= 5 ? "Incluso" : "Nao incluso";
    }

    public int totalAvalicao() {
        return totalAvaliacoes++;
    }

}

