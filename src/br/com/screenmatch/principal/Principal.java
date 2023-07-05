package br.com.screenmatch.principal;

import br.com.screenmatch.entity.Filme;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Principal {


    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        Calendar hoje = Calendar.getInstance();
        int idd;

        Filme filme = new Filme();

        filme.nome = "Top gun Maverick";
        filme.anoDoLancamento = 2022;
        filme.duracaoEmMinutos = 180;


        // filme.exibeFichaTecnica();
        filme.avalia(9);
        filme.avalia(7);
        filme.avalia(9);

        System.out.println("O total de avaliacoes foi: " + decimalFormat.format(filme.getTotalAvaliacoes()));
        System.out.println("O total de avaliacoes foi: " + decimalFormat.format(filme.pegaMedia()));
        System.out.println(decimalFormat.format(filme.pegaMedia()));
//        filme.somaDasAvaliacoes = 10;
//        filme.totalAvaliacoes = 1;
    }
}
