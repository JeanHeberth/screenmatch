package br.com.listas.principal;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Principal {


    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        Date date = new Date();
        String hora = new SimpleDateFormat("HH:mm:ss").format(date);


        // Primeiro filme cadastrado na lista
        Filme filme = new Filme("Top gun Maverick", 2022);
        filme.setDuracaoEmMinutos(180);
        filme.setIncluidoNoPlano(false);


        // Segundo filme cadastrado na lista
        Filme outroFilme = new Filme("John Wick", 2023);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setIncluidoNoPlano(false);


        // Terceiro filme cadastrado na lista
        Serie lost = new Serie("Lost", 2002);
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setIncluidoNoPlano(true);
        lost.setMinutosPorEpisodio(50);
        lost.avalia(2);
        lost.avalia(10);
        lost.avalia(9);


        // Quarto filme cadastrado na lista
        Filme filmeDoJean = new Filme("Testes", 2022);
        filmeDoJean.setNome("Rock Balboa");
        filmeDoJean.setAnoDoLancamento(1998);
        filmeDoJean.avalia(10);

        ArrayList<Filme> filmes = new ArrayList<>();

        filmes.add(filme);
        filmes.add(outroFilme);
        filmes.add(filmeDoJean);

        System.out.println("Verificando o tamanho da lista de filmes " + filmes.size());
        System.out.println(filmes);
        System.out.println(filmes.get(2).toString());






    }
}
