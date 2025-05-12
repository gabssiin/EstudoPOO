package Q17;

class Revista extends Material {
    String edicao;

    public Revista(String titulo, String edicao) {
        super(titulo);
        this.edicao = edicao;
    }

    @Override
    public String informarMaterial() {
        return "Revista: " + titulo + " (Edição: " + edicao + ")";
    }

    public String getEdicao() {
        return edicao;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
}