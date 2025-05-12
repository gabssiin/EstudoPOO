package Q7;

public abstract class Veiculo {
    int capacidade;
    double velocidadeMaxima;

    public Veiculo(int capacidade, double velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double calcularTempo(double distancia) throws VelocidadeInvalidaException {
        if (this.velocidadeMaxima <= 0) {
            throw new VelocidadeInvalidaException("Erro: A velocidade máxima do veículo deve ser maior que zero.");
        }
        return distancia / this.velocidadeMaxima;
    }



    public int getCapacidade() {
        return capacidade;
    }
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public abstract String tipoDeCombustivel();
}