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

public class ContaCorrente extends Conta {


    private static final double TAXA_SAQUE = 0.10;



    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }


    @Override
    public double sacar(double valor) {
        double valorTotal = valor * (1 + TAXA_SAQUE);
        if (valor > 0 && valorTotal <= getSaldo()) {
            setSaldo(getSaldo() - valorTotal);
            System.out.println("Saque de R$" + valor + " realizado com sucesso na conta corrente de " + getTitular() + " (taxa de 10%: R$" + (valor * TAXA_SAQUE) + "). Novo saldo: R$" + getSaldo());
            return valor;
        } else {
            System.out.println("Erro ao sacar na conta corrente de " + getTitular() + ": saldo insuficiente ou valor inválido (incluindo taxa).");
            return 0;
        }
    }
}


