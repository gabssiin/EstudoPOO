package Q9;

public abstract class Imagem {
    int largura;
    int altura;

    public Imagem(int largura, int altura) throws DimensaoInvalidaException {
        if (largura <= 0 || altura <= 0) {
            throw new DimensaoInvalidaException("Erro: As dimensões da imagem devem ser maiores que zero.");
        }
        this.largura = largura;
        this.altura = altura;
    }

    public int calcularTamanho() {
        return largura * altura;
    }

    public abstract String processar();

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getLargura() {
        return largura;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }
    
}