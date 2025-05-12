package Q16;

public abstract class Ingrediente {
    String nome;
    double quantidade;

    public Ingrediente(String nome, double quantidade) throws QuantidadeInvalidaException {
        if (quantidade <= 0) {
            throw new QuantidadeInvalidaException("Erro: A quantidade do ingrediente deve ser maior que zero.");
        }
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public abstract String informar();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}