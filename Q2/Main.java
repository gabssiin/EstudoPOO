package Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando objetos com entrada do usuário
        System.out.println("--- Criando Veículo Genérico ---");
        System.out.print("Digite a marca: ");
        String marcaVeiculo = scanner.nextLine();
        System.out.print("Digite o modelo: ");
        String modeloVeiculo = scanner.nextLine();
        System.out.print("Digite o ano: ");
        int anoVeiculo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
        Veiculo veiculoGenerico = new Veiculo(marcaVeiculo, modeloVeiculo, anoVeiculo);
        System.out.println("\n--- Veículo Genérico Criado ---");
        veiculoGenerico.exibirInformacoesVeiculo();

        System.out.println("\n--- Criando Carro ---");
        System.out.print("Digite a marca: ");
        String marcaCarro = scanner.nextLine();
        System.out.print("Digite o modelo: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Digite o ano: ");
        int anoCarro = scanner.nextInt();
        System.out.print("Digite o número de portas: ");
        int numeroPortasCarro = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        Carro carro = new Carro(marcaCarro, modeloCarro, anoCarro, numeroPortasCarro);
        System.out.println("\n--- Carro Criado ---");
        carro.exibirInformacoesVeiculo();

        System.out.println("\n--- Criando Motocicleta ---");
        System.out.print("Digite a marca: ");
        String marcaMoto = scanner.nextLine();
        System.out.print("Digite o modelo: ");
        String modeloMoto = scanner.nextLine();
        System.out.print("Digite o ano: ");
        int anoMoto = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Digite o tipo de guidão: ");
        String tipoGuidãoMoto = scanner.nextLine();
        Motocicleta moto = new Motocicleta(marcaMoto, modeloMoto, anoMoto, tipoGuidãoMoto);
        System.out.println("\n--- Motocicleta Criada ---");
        moto.exibirInformacoesVeiculo();

        // Testando o método setAno com entrada do usuário e tratamento de exceção
        System.out.println("\n--- Testando setAno do Carro ---");
        System.out.print("Digite um novo ano para o carro: ");
        int novoAnoCarro = scanner.nextInt();
        try {
            carro.setAno(novoAnoCarro);
            System.out.println("Ano do carro atualizado para: " + carro.getAno());
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao tentar definir o ano do carro: " + e.getMessage());
        }

        // Testando o método setNumeroDePortas com entrada do usuário e tratamento de
        // exceção
        System.out.println("\n--- Testando setNumeroDePortas do Carro ---");
        System.out.print("Digite um novo número de portas para o carro: ");
        int novoNumeroPortasCarro = scanner.nextInt();
        try {
            carro.setNumeroDePortas(novoNumeroPortasCarro);
            System.out.println("Número de portas do carro atualizado para: " + carro.getNumeroDePortas());
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao tentar definir o número de portas do carro: " + e.getMessage());
        }

        System.out.println("\n--- Informações Finais ---");
        System.out.println("Veículo Genérico:");
        veiculoGenerico.exibirInformacoesVeiculo();
        System.out.println("\nCarro:");
        carro.exibirInformacoesVeiculo();
        System.out.println("\nMotocicleta:");
        moto.exibirInformacoesVeiculo();

        scanner.close();
    }
}