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
class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    public void adicionarRendimento(double percentual) {
        if (percentual > 0) {
            double rendimento = getSaldo() * (percentual / 100);
            setSaldo(getSaldo() + rendimento);
            System.out.println("Rendimento de " + percentual + "% (R$" + rendimento + ") adicionado à conta poupança de " + getTitular() + ". Novo saldo: R$" + getSaldo());
        } else {
            System.out.println("Percentual de rendimento inválido.");
        }
    }
}