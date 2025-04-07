package Q4;

public class Main {
    public static void main(String[] args) {
        Loja minhaLoja = new Loja();

        // Criando produtos
        Computador computador1 = new Computador("Dell XPS 15", 12000.00);
        Smartphone smartphone1 = new Smartphone("Samsung Galaxy S23", 4500.00);
        Tablet tablet1 = new Tablet("iPad Air", 3000.00);
        Computador computador2 = new Computador("MacBook Pro", 15000.00);
        Smartphone smartphone2 = new Smartphone("iPhone 15", 5000.00);

        // Adicionando produtos à loja
        minhaLoja.adicionarProduto(computador1);
        minhaLoja.adicionarProduto(smartphone1);
        minhaLoja.adicionarProduto(tablet1);
        minhaLoja.adicionarProduto(computador2);
        minhaLoja.adicionarProduto(smartphone2);

        // Listando as garantias dos produtos
        minhaLoja.listarGarantias();

        // Listando informações completas dos produtos
        minhaLoja.listarProdutosComInformacoes();
    }
}
