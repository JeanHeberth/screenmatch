package br.com.desafio.principal;

import br.com.desafio.entity.MinhasPreferidas;
import br.com.desafio.entity.Musica;
import br.com.desafio.entity.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica musica = new Musica();
        Podcast podcast = new Podcast();
        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();

        musica.setTitulo("Forever");
        musica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            musica.curte();
        }
        podcast.setTitulo("BolhaDev");
        podcast.setApresentador("Marcos Mendes");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        minhasPreferidas.inclui(podcast);
        minhasPreferidas.inclui(musica);
    }
}
