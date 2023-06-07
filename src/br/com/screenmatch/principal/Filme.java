package br.com.screenmatch.principal;

import java.time.LocalDate;
import java.util.Calendar;

public class Filme {
    Calendar hoje = Calendar.getInstance();
    int hoje2 = LocalDate.now().getYear();
    LocalDate hoje3 = LocalDate.now();

    String nome;
    int anoDoLancamento;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracaoEmMinutos;

    // boolean lancamento;
    // idade= idd;


    private int idade;

    public int getIdade() {
        return idade;
    }

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento do filme: " + anoDoLancamento);
        System.out.println("Duracao do filme: " + duracaoEmMinutos + " minutos");
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalAvaliacoes;
    }

    void calculaIdade() {
        //this.idd = (hoje.get(Calendar.YEAR) - (anoDoLancamento));
        this.idade = hoje3.getYear() - anoDoLancamento;
    }

    String descobrePlano() {
        this.calculaIdade();

      //  return idade <= 5?"Incluso":"Não Incluso";
        //dfasfddfasfd

        if (idade <= 5) {
            return "Incluso";
        }
        return "Nao incluso";
    }
}

// Plano user

//Plus ->
/*
Lista de filmes
 */


// basico
/*
Retira da lista
 */

