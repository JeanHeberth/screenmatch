package br.com.screenmatch.entity;

import java.time.LocalDate;

public class Filme3 {

    private String nome;
    private int anoDoLancamento;
    private int duracaoEmMinutos;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int idade;
    private boolean lancamento;


    private int calculaIdade(int anoDoLancamento) {
        return LocalDate.now().getYear() - anoDoLancamento;
    }

    private boolean eLancamento(int idade) {
        return idade <= 5 ? true : false;
    }


    @Override
    public String toString() {
        return "Filme3{" +
                "nome='" + nome + '\'' +
                ", anoDoLancamento=" + anoDoLancamento +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", somaDasAvaliacoes=" + somaDasAvaliacoes +
                ", totalAvaliacoes=" + totalAvaliacoes +
                ", idade=" + idade +
                ", lancamento=" + lancamento +
                '}';
    }

    public void avaliacao(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDoLancamento() {
        return anoDoLancamento;
    }

    public void setAnoDoLancamento(int anoDoLancamento) {
        this.anoDoLancamento = anoDoLancamento;
        this.idade = calculaIdade(this.anoDoLancamento);
        this.lancamento = eLancamento(this.idade);
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}

