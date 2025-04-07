package Q4;

public class Tablet extends Produto {
    public Tablet(String nomeProd, double precoProd) {
        super(nomeProd, precoProd);
    }

    @Override
    public int calcularGarantia() {
        return 1;
    }
}