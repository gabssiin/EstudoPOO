package Q4;

/*
 * Q4: Loja de Produtos Eletrônicos

 Este Qenvolve uma loja com diferentes tipos de produtos eletrônicos e cálculo de garantia.

 Crie a classe base Produto com atributos como nome, preco, e o método calcularGarantia(), que retorna uma garantia padrão de 1 ano.
 Crie as subclasses Computador, Smartphone e Tablet. Cada um deve ter uma implementação própria para calcularGarantia():
 Computador: 3 anos de garantia.
 Smartphone: 2 anos de garantia.
 Tablet: 1 ano de garantia (o padrão).
 Crie a classe Loja que mantém uma lista de produtos e tenha um método listarGarantias() para exibir o tempo de garantia de cada produto.
 Crie uma Main para testar e manipular todos os objetos citados anteriormente.

 */

public class Produto {
    private String nomeProd;
    private double precoProd;

    public Produto() {

    }

    public Produto(String nomeProd, double precoProd) {
        this.nomeProd = nomeProd;
        this.precoProd = precoProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public double getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(double precoProd) {
        this.precoProd = precoProd;
    }

    public int calcularGarantia() {
        return 1; // Garantia padrão de 1 ano
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNomeProd());
        System.out.println("Preço: " + getPrecoProd());
        System.out.println("Garantia: " + calcularGarantia() + " ano(s)");
    }
}