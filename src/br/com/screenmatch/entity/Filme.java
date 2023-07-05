package br.com.screenmatch.entity;

import java.time.LocalDate;
import java.util.Calendar;

public class Filme {
    Calendar hoje = Calendar.getInstance();
    int hoje2 = LocalDate.now().getYear();
    LocalDate hoje3 = LocalDate.now();

   public String nome;
   public int anoDoLancamento;
     private double somaDasAvaliacoes;
      private int totalAvaliacoes;
    public  int duracaoEmMinutos;


    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }


    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento do filme: " + anoDoLancamento);
        System.out.println("Duracao do filme: " + duracaoEmMinutos + " minutos");
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalAvaliacoes;
    }


}


