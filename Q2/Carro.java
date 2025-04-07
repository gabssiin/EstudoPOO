package Q2;

/*Representação da hierarquia de veículos com características comuns e específicas.

Criar a classe base Veiculo com os atributos marca, modelo e ano, e um método informacoes() que imprime essas informações.
Criar as subclasses Carro e Motocicleta. Adicione um atributo exclusivo Carro, como numeroDePortas, e outro exclusivo à Motocicleta, como tipoDeGuidão.
Em ambas as subclasses, sobrescrever o método informacoes() para exibir as informações comuns e específicas de cada veículo.
Crie uma Main para testar e manipular todos os objetos citados anteriormente. */

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        if (numeroDePortas < 5 || numeroDePortas > 1) {
            throw new IllegalArgumentException("O numéro de portas do seu carro está incorreto: " + numeroDePortas
                    + "O número de portas deve estar entre 1 a 5 ");
        }
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirInformacoesVeiculo() {
        super.exibirInformacoesVeiculo();
        System.out.println("Número de portas: " + numeroDePortas);
    }
}
