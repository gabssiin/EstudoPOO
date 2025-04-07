package Q3;

public class Main {
    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa();

        // Criando funcionários
        Gerente gerente1 = new Gerente("João Silva", 5000.0, 1500.0);
        Desenvolvedor dev1 = new Desenvolvedor("Maria Oliveira", 3000.0, 1.3);
        Estagiario est1 = new Estagiario("Pedro Souza", 1000.0);
        Desenvolvedor dev2 = new Desenvolvedor("Ana Paula", 3500.0, 1.2);
        Gerente gerente2 = new Gerente("Carlos Rocha", 6000.0, 2000.0);

        // Adicionando funcionários à empresa
        minhaEmpresa.adicionarFuncionario(gerente1);
        minhaEmpresa.adicionarFuncionario(dev1);
        minhaEmpresa.adicionarFuncionario(est1);
        minhaEmpresa.adicionarFuncionario(dev2);
        minhaEmpresa.adicionarFuncionario(gerente2);

        // Calculando e exibindo a folha de pagamento
        minhaEmpresa.calcularFolhaDePagamento();
    }
}
