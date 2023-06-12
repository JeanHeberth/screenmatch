package br.com.screenmatch.entity;

import java.time.LocalDate;
import java.util.Calendar;

public class Filme2 {
    Calendar hoje = Calendar.getInstance();
    int hoje2 = LocalDate.now().getYear();
    LocalDate hoje3 = LocalDate.now();

    private String nome = "Top gun Maverick";
    private int anoDoLancamento = 2022;
    private int duracaoEmMinutos = 180;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int idade;
    private boolean lancamento;

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
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isLancamento() {
        return lancamento;
    }

    public void setLancamento(boolean lancamento) {
        this.lancamento = lancamento;
    }

   public void avaliacao(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;

    }

    public double pegaMedia(){
       return somaDasAvaliacoes / totalAvaliacoes;
    }
}