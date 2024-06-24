package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;


public class CadastroProdutos {
    //atributos
    private final Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 1", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 10d, 10);
        cadastroProdutos.adicionarProduto(3L, "Produto 3", 8d, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto 4", 14d, 0);
        cadastroProdutos.adicionarProduto(5L, "Produto 8", 5d, 1);

//        System.out.println(cadastroProdutos.produtoSet);

//        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
