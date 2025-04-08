package Q5;

public class MainTestes {
    public static void main(String[] args) {
        System.out.println("----- Testes Individuais das Contas -----");

        // Testes da Conta Corrente
        System.out.println("\n--- Testes Conta Corrente ---");
        ContaCorrente cc1 = new ContaCorrente("João", 1000.0);
        System.out.println("Saldo inicial CC1: R$" + cc1.getSaldo());
        cc1.depositar(200.0);
        System.out.println("Saldo após depósito: R$" + cc1.getSaldo());
        cc1.sacar(100.0);
        System.out.println("Saldo após saque com taxa: R$" + cc1.getSaldo());
        cc1.sacar(1500.0); // Tentativa de saque com saldo insuficiente
        System.out.println("Saldo após tentativa de saque alto: R$" + cc1.getSaldo());

        // Testes da Conta Poupança
        System.out.println("\n--- Testes Conta Poupança ---");
        ContaPoupanca cp1 = new ContaPoupanca("Maria", 500.0);
        System.out.println("Saldo inicial CP1: R$" + cp1.getSaldo());
        cp1.depositar(100.0);
        System.out.println("Saldo após depósito: R$" + cp1.getSaldo());
        cp1.adicionarRendimento(5.0);
        System.out.println("Saldo após adicionar rendimento: R$" + cp1.getSaldo());
        cp1.sacar(200.0);
        System.out.println("Saldo após saque: R$" + cp1.getSaldo());

        // Testes da Conta Salário
        System.out.println("\n--- Testes Conta Salário ---");
        ContaSalario cs1 = new ContaSalario("Carlos", 2000.0, 3);
        System.out.println("Saldo inicial CS1: R$" + cs1.getSaldo() + ", Limite de saques: " + cs1.getLimiteSaques());
        cs1.sacar(100.0);
        System.out.println("Saldo após 1º saque: R$" + cs1.getSaldo() + ", Saques realizados: " + cs1.getSaquesRealizados());
        cs1.sacar(200.0);
        System.out.println("Saldo após 2º saque: R$" + cs1.getSaldo() + ", Saques realizados: " + cs1.getSaquesRealizados());
        cs1.sacar(50.0);
        System.out.println("Saldo após 3º saque: R$" + cs1.getSaldo() + ", Saques realizados: " + cs1.getSaquesRealizados());
        cs1.sacar(100.0); // Tentativa de saque excedendo o limite
        System.out.println("Saldo após tentativa de 4º saque: R$" + cs1.getSaldo() + ", Saques realizados: " + cs1.getSaquesRealizados());
        cs1.depositar(500.0);
        System.out.println("Saldo após depósito: R$" + cs1.getSaldo());
    }
}


