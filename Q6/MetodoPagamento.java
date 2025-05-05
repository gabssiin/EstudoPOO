package Q6;

/*
Q6: Sistema de Pagamento com Métodos de Pagamento
Implementar um sistema de pagamento que possui diferentes métodos de
pagamento, cada um com regras específicas.
• Classe abstrata: MetodoPagamento
o Atributos:
▪ taxa: Double

o Métodos:

▪ processarPagamento(valor: Double): Boolean (método
abstrato para processar o pagamento, deve retornar true se
bem-sucedido e false caso contrário)

▪ calcularTaxa(valor: Double): Double (Retorna o valor
multiplicado pela taxa)

• Subclasses:
o CartaoCredito: Sobrescrever processarPagamento(valor: Double):
Boolean para incluir uma lógica onde a transação é permitida
apenas se a taxa for menor que 0.02.
o Pix: Sobrescrever processarPagamento(valor: Double): Boolean para
processar pagamentos instantâneos sem aplicar taxa.
o Boleto: Sobrescrever processarPagamento(valor: Double): Boolean
para aplicar uma taxa fixa de 5%.
• Classe utilitária: SistemaPagamento
o Métodos:
▪ efetuarPagamento(metodo: MetodoPagamento, valor:
Double): Boolean (Chama processarPagamento no método
de pagamento fornecido e exibe a taxa aplicada).
 */

public abstract class MetodoPagamento {
    double taxa;

    public MetodoPagamento(double taxa) {
        this.taxa = taxa;
    }

    public abstract boolean processarPagamento(double valor) throws TaxaInvalidaException;

    public double calcularTaxa(double valor) {
        return valor * this.taxa;
    }
}