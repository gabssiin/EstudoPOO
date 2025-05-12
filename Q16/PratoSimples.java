package Q16;

class PratoSimples implements Preparo {
    private String nomePrato;

    public PratoSimples(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    @Override
    public String preparar() {
        return "Preparando o prato simples: " + nomePrato + ". Cozinhar e servir.";
    }

    public String getNomePrato() {
        return nomePrato;
    }
    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }
}