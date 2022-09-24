package src.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
        Produto arroz = new Pereciveis("Arroz", 5.20, 40);
        Produto feijao = new Pereciveis("Feijao", 7.20, 60);
        Produto macarrao = new Pereciveis("Macarrao", 3.20, 90);
        Produto carne = new Pereciveis("Carne", 12.20, 30);
        Produto bolacha = new Pereciveis("Bolacha", 3, 50);

        Produto caderno = new NaoPereciveis("Caderno", 6, "Sei la");
        Produto lapis = new NaoPereciveis("Lápis", 1, "Sei la");
        Produto caneta = new NaoPereciveis("Caneta", 2, "Sei la");
        Produto borracha = new NaoPereciveis("Borracha", 3, "Sei la");
        Produto regua = new NaoPereciveis("Caderno", 5, "Sei la");

        List<ItemVenda> itensVenda = new ArrayList<>();

        itensVenda.add(new ItemVenda(arroz, 10));
        itensVenda.add(new ItemVenda(feijao, 10));
        itensVenda.add(new ItemVenda(macarrao, 5));
        itensVenda.add(new ItemVenda(carne, 8));
        itensVenda.add(new ItemVenda(bolacha, 7));

        itensVenda.add(new ItemVenda(caderno, 1));
        itensVenda.add(new ItemVenda(lapis, 3));
        itensVenda.add(new ItemVenda(caneta, 2));
        itensVenda.add(new ItemVenda(borracha, 1));
        itensVenda.add(new ItemVenda(regua, 1));

        double valorTotal = 0;
        for(ItemVenda iv: itensVenda){
            valorTotal+=iv.getProduto().calcular(iv.getQuantidade());
            System.out.println(iv.getProduto());
        }

        System.out.println("TOTAL = " +valorTotal);
    }
}
