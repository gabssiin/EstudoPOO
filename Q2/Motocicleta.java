package Q2;

/*Representação da hierarquia de veículos com características comuns e específicas.

Criar a classe base Veiculo com os atributos marca, modelo e ano, e um método informacoes() que imprime essas informações.
Criar as subclasses Carro e Motocicleta. Adicione um atributo exclusivo Carro, como numeroDePortas, e outro exclusivo à Motocicleta, como tipoDeGuidão.
Em ambas as subclasses, sobrescrever o método informacoes() para exibir as informações comuns e específicas de cada veículo.
Crie uma Main para testar e manipular todos os objetos citados anteriormente. */

public class Motocicleta extends Veiculo {
    private String tipoDeGuidao;

    public Motocicleta(String marca, String modelo, int ano, String tipoDeGuidao) {
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    public void setTipoDeGuidao(String tipoDeGuidao) {
        this.tipoDeGuidao = tipoDeGuidao;
    }

    @Override
    public void exibirInformacoesVeiculo() {
        super.exibirInformacoesVeiculo();
        System.out.println("Tipo de guidão: " + tipoDeGuidao);
    }
}
