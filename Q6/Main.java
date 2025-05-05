package Q6;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        try {
            MetodoPagamento cartaoTaxaNegativa = new CartaoCredito(-0.01);
            sistema.efetuarPagamento(cartaoTaxaNegativa, 100.0);
        } catch (Exception e) {
            System.err.println("Erro ao criar método de pagamento: " + e.getMessage());
        }

        MetodoPagamento cartao = new CartaoCredito(0.015);
        sistema.efetuarPagamento(cartao, 100.0);

        MetodoPagamento cartaoTaxaAlta = new CartaoCredito(0.03);
        sistema.efetuarPagamento(cartaoTaxaAlta, 50.0);

        MetodoPagamento pix = new Pix();
        sistema.efetuarPagamento(pix, 75.0);

        MetodoPagamento boleto = new Boleto();
        sistema.efetuarPagamento(boleto, 200.0);
    }
}

