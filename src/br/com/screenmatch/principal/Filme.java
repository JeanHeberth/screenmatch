package br.com.screenmatch.principal;

import java.util.Calendar;

public class Filme {
    Calendar hoje = Calendar.getInstance();

    String nome;
    int anoDoLancamento;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracaoEmMinutos;
    int idade;


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

    int calculaIdade() {
        return idade = (hoje.get(Calendar.YEAR) - (anoDoLancamento));
    }

    String descobrePlano() {
        if (idade > 5) {
            return "Nao incluso";
        }
        return "Incluso";
    }
}
// Se a idade do filme for maior que 5 anos, ele nao está incluso no plano
// Caso contrário está incluso.

