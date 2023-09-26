package br.com.listas.principal;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {

    public static void main(String[] args) {
        Filme outroFilme = new Filme("John Wick", 2023);
        outroFilme.avalia(8);
        Filme filmeDoJean = new Filme("Testes", 2022);
        filmeDoJean.avalia(5);
        Filme filme = new Filme("Top gun Maverick", 2022);
        filme.avalia(7);
        Serie lost = new Serie("Lost", 2002);

//        Filme f1 = filmeDoJean;

//        System.out.println(f1);

        ArrayList<Titulo> listaFilmesAssistidos = new ArrayList<>();

        listaFilmesAssistidos.add(filme);
        listaFilmesAssistidos.add(outroFilme);
        listaFilmesAssistidos.add(filmeDoJean);
        listaFilmesAssistidos.add(lost);

        for (Titulo item : listaFilmesAssistidos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme1 && filme1.getClassificacao() > 2) {
                System.out.println(filme1.getClassificacao());
            }
        }
    }
}
