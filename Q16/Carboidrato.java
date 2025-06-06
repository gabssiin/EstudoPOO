package Q16;

class Carboidrato extends Ingrediente {
    String tipo;

    public Carboidrato(String nome, double quantidade, String tipo) throws QuantidadeInvalidaException {
        super(nome, quantidade);
        this.tipo = tipo;
    }

    @Override
    public String informar() {
        return nome + " (" + quantidade + "g de carboidrato " + tipo + ")";
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}