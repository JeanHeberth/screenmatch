package br.com.screenmatch.principal;

import java.text.DecimalFormat;
import java.time.LocalDate;
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
        filme.anoDoLancamento = 1970;
        filme.duracaoEmMinutos = 180;

        // filme.exibeFichaTecnica();
        filme.avalia(9);
        filme.avalia(7);
        filme.avalia(9);
/*
        System.out.println("A soma das avaliacoes foi: " +filme.somaDasAvaliacoes);
        System.out.println("O total de avaliacoes foi: " +filme.totalAvaliacoes);
        System.out.println("O total de avaliacoes foi: " +decimalFormat.format(filme.pegaMedia()));*/
         System.out.println("O Filme está incluso no plano? " +filme.descobrePlano());
        //  System.out.println("A idade do filme é: " + filme.calculaIdade() + " anos.");
        System.out.println(idd = hoje.get(Calendar.YEAR) - (filme.anoDoLancamento));
        if (idd > 5) {
            System.out.println("Nao incluso");
        }
        System.out.println("Incluso");
    }
}
