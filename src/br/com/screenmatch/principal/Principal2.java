package br.com.screenmatch.principal;

import br.com.screenmatch.entity.Filme2;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Principal2 {


    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/YYYY");


        Filme2 filme2 = new Filme2();


        System.out.println("Nome do filme: " + filme2.getNome());
        System.out.println("Ano do lancamento: " + filme2.getAnoDoLancamento());
        System.out.println("Tempo de duracao do filme: " + filme2.getDuracaoEmMinutos() + " min");

        filme2.avaliacao(9);
        filme2.avaliacao(5);
        filme2.avaliacao(7);

        System.out.println("Soma das avaliacoes do filme " + (filme2.getSomaDasAvaliacoes()));
        System.out.println("Média das avaliacoes do filme " + (filme2.pegaMedia()));
       // System.out.println("fafssfad " + filme2.pegaIdade());
        System.out.println("fafssfad " + filme2.getIdade());
        System.out.println(filme2.informaLancamento());
        System.out.println(filme2.totalAvalicao());
    }
}
