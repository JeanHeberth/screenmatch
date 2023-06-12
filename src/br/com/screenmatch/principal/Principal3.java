package br.com.screenmatch.principal;

import br.com.screenmatch.entity.Filme3;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Principal3 {


    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        Filme3 filme3 = new Filme3();
        filme3.setNome("Top Gun");
        filme3.setAnoDoLancamento(1900);
        filme3.setDuracaoEmMinutos(180);


        System.out.println("Nome do filme: " + filme3.getNome());
        System.out.println("Ano do lancamento: " + filme3.getAnoDoLancamento());
        System.out.println("Tempo de duracao do filme: " + filme3.getDuracaoEmMinutos() + " min");

        filme3.avaliacao(9);
        filme3.avaliacao(5);
        filme3.avaliacao(7);

        System.out.println(filme3.toString());


//        System.out.println("Soma das avaliacoes do filme " + (filme3.getSomaDasAvaliacoes()));
//        System.out.println("Média das avaliacoes do filme " + (filme3.pegaMedia()));
//        System.out.println("fafssfad " + filme3.pegaIdade());
        System.out.println("fafssfad " + filme3.getIdade());
//        System.out.println(filme3.informaLancamento());
//        System.out.println(filme3.totalAvalicao());
    }
}
