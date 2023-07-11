package br.com.screenmatch.principal;

import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Principal {


    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        Date date = new Date();
        String hora = new SimpleDateFormat("HH.mm.ss").format(date);

        Filme filme = new Filme();
        Filme outroFilme = new Filme();
        Serie lost = new Serie();


        outroFilme.setNome("Top gun Maverick");
        outroFilme.setAnoDoLancamento(2022);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setIncluidoNoPlano(false);

        filme.setNome("Top gun Maverick");
        filme.setAnoDoLancamento(2022);
        filme.setDuracaoEmMinutos(180);
        filme.setIncluidoNoPlano(false);


        // filme.exibeFichaTecnica();
        filme.avalia(9);
        filme.avalia(7);
        filme.avalia(9);
        System.out.println("######### Ficha técnica do filme ############");
        System.out.println("O total de avaliacoes foi: " + decimalFormat.format(filme.getTotalAvaliacoes()));
        System.out.println("A média das avaliacoes foi: " + decimalFormat.format(filme.pegaMedia()));
        System.out.println("empo de duracao da filme: " + filme.getDuracaoEmMinutos());
        System.out.println("Está incluso no plano: " + filme.isIncluidoNoPlano());
        System.out.println("#############################################");


        lost.setNome("Lost");
        lost.setAnoDoLancamento(2002);
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setIncluidoNoPlano(true);
        lost.setMinutosPorEpisodio(50);

        lost.avalia(8);
        lost.avalia(7);
        lost.avalia(5);

        System.out.println("######### Ficha técnica da lost ############");
        System.out.println("#############################################");
        System.out.println("O total de avaliacoes foi: " + decimalFormat.format(lost.getTotalAvaliacoes()));
        System.out.println("A média das avaliacoes foi: " + decimalFormat.format(lost.pegaMedia()));
        System.out.println("Tempo de duracao da série: " +lost.getDuracaoEmMinutos());
        System.out.println("Está incluso no plano: " +lost.isIncluidoNoPlano());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(filme);
        calculadoraDeTempo.inclui(lost);
        calculadoraDeTempo.inclui(outroFilme);
        calculadoraDeTempo.conversaoMinutosParaHora();
        System.out.println("############### " +calculadoraDeTempo.getTempoTotal());
        System.out.println("############### " +decimalFormat.format(calculadoraDeTempo.getTempoTotalTest()));


    }
}
