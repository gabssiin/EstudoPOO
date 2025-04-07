package Q4;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos;

    public Loja() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void listarGarantias() {
        System.out.println("--- Garantias dos Produtos ---");
        for (Produto produto : produtos) {
            System.out.println(produto.getNomeProd() + ": " + produto.calcularGarantia() + " ano(s)");
        }
        System.out.println("------------------------------");
    }

    public void listarProdutosComInformacoes() {
        System.out.println("--- Informações dos Produtos ---");
        for (Produto produto : produtos) {
            produto.exibirInformacoes();
            System.out.println("------------------------------");
        }
        System.out.println("---------------------------------");
    }
}