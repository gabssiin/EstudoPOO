package Q5;

/*/* 
Q5: Hierarquia de Contas Bancárias

Neste exercício, vamos implementar um sistema bancário que inclui diferentes tipos de contas e funcionalidades adicionais.

Crie a classe base Conta com os atributos titular e saldo, e os métodos depositar() e sacar(), onde o saque verifica se há saldo suficiente.
Crie as subclasses ContaCorrente, ContaPoupanca e ContaSalario, cada uma com comportamento distinto:
ContaCorrente: Implementa uma taxa de operação em cada saque.
ContaPoupanca: Possui um método adicional adicionarRendimento() que incrementa o saldo com um valor percentual de rendimento.
ContaSalario: Limita o número de saques mensais.
Crie a classe Banco que gerencia uma lista de contas, com métodos para adicionar contas e gerar um relatório com saldo de cada tipo de conta e operações disponíveis.
Crie uma Main para testar e manipular todos os objetos citados anteriormente.
Atenção: Da questão 6 em diante sempre criar uma Main para testar e validar os objetos das classes citadas no enunciado!
*/ 

public class ContaSalario{

    private int limiteSaque;

    public ContaSalario(){
    }
    
    public ContaSalario(String titular, double saldo, int limiteSaque){
        super(titular,saldo);
        this.limiteSaque = limiteSaque;
    }

    public int getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(int limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    @Override 
    public double   
}