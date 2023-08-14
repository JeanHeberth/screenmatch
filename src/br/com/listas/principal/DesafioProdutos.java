package br.com.listas.principal;

import br.com.screenmatch.Produto;
import br.com.screenmatch.modelos.Filme;

import java.util.ArrayList;

public class DesafioProdutos {


    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produto = new Produto();

        produto.setCodigo(1L);
        produto.setNome("Produtaço 1");

        produto.setCodigo(2L);
        produto.setNome("Produtaço 2");


        produto.setCodigo(3L);
        produto.setNome("Produtaço 3");

        produto.setCodigo(4L);
        produto.setNome("Produtaço 4");



        produtos.add(produto);
        produtos.add(produto);
        produtos.add(produto);
        produtos.add(produto);



        System.out.println("Tamanho da lista " +produtos.size());
        System.out.println("Tamanho da lista " +produtos.get(3).toString());

    }
}
