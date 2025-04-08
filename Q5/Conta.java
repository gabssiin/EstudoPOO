package Q5;
/* 
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
public class Conta {
  private String titular;
  private double saldo;
  
    public Conta(){

    }   
    public Conta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso na conta de " + titular + ". Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }


    public double sacar(double valor) {
        valor = 100;
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
            return saldo; 
        }
        saldo -= valor; 
        return saldo; 
    }
}