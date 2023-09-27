package br.com.desafio.lists.compras.credito;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = sc.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0) {
            System.out.println("Digite a descrição da sua compra");
            String descricao = sc.next();

            System.out.println("Digite o valor da sua compra");
            double valor = sc.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = sc.nextInt();
            } else {
                System.out.println("Saldo insuficiente");
                sair = 0;
            }
        }
        System.out.println("***********************");
        System.out.println("Compras realizadas: \n");
        Collections.sort(cartao.getCompras());
        for (Compra compras : cartao.getCompras()) {
            System.out.println(compras.getDescricao() + " - " + compras.getValor());
        }
        System.out.println("\n***************");
        System.out.println("\nSaldo do cartão: " + cartao.getSaldo());
    }

}

