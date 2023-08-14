package br.com.desafio.lists;

import br.com.screenmatch.Produto;

import java.util.ArrayList;

public class Carrinho {


    ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionaProduto(Produto produto) {
        if (produtos.size() < 10) {
            produtos.add(produto);
        } else {
            System.out.println("Carrinho cheio!");
        }
    }


}
