package Q8;

public abstract class MaterialBiblioteca {
    String titulo;
    int prazoDevolucao;
    private static final double TAXA_PADRAO = 1.50;

    public MaterialBiblioteca(String titulo, int prazoDevolucao) {
        this.titulo = titulo;
        this.prazoDevolucao = prazoDevolucao;
    }

    public double calcularMulta(int diasAtraso) throws AtrasoInvalidoException {
        if (diasAtraso < 0) {
            throw new AtrasoInvalidoException("Erro: Os dias de atraso não podem ser negativos.");
        }
        return diasAtraso * TAXA_PADRAO;
    }

    public int getPrazoDevolucao() {
        return prazoDevolucao;
    }
    public static double getTaxaPadrao() {
        return TAXA_PADRAO;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setPrazoDevolucao(int prazoDevolucao) {
        this.prazoDevolucao = prazoDevolucao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}