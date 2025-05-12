package Q17;

public abstract class Material {
    String titulo;

    public Material(String titulo) {
        this.titulo = titulo;
    }

    public abstract String informarMaterial();

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}