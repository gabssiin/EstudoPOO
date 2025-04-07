package Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando objeto Veiculo com entrada do usuário e tratamento de exceção
        System.out.println("--- Criando Veículo Genérico ---");
        System.out.print("Digite a marca: ");
        String marcaVeiculo = scanner.nextLine();
        System.out.print("Digite o modelo: ");
        String modeloVeiculo = scanner.nextLine();
        System.out.print("Digite o ano: ");
        int anoVeiculo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        Veiculo veiculoGenerico = null;
        try {
            veiculoGenerico = new Veiculo(marcaVeiculo, modeloVeiculo, anoVeiculo);
            System.out.println("\n--- Veículo Genérico Criado ---");
            veiculoGenerico.exibirInformacoesVeiculo();
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao criar Veículo Genérico: " + e.getMessage());
            veiculoGenerico = new Veiculo(marcaVeiculo, modeloVeiculo, 2000); // Criando com um ano padrão
            System.out.println("\n--- Veículo Genérico Criado com ano padrão (2000) devido ao erro ---");
            veiculoGenerico.exibirInformacoesVeiculo();
        }

        // Criando objeto Carro com entrada do usuário e tratamento de exceção
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

        Carro carro = null;
        try {
            carro = new Carro(marcaCarro, modeloCarro, anoCarro, numeroPortasCarro);
            System.out.println("\n--- Carro Criado ---");
            carro.exibirInformacoesVeiculo();
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao criar Carro: " + e.getMessage());
            carro = new Carro(marcaCarro, modeloCarro, 2010, 4); // Criando com valores padrão
            System.out.println("\n--- Carro Criado com valores padrão devido ao erro ---");
            carro.exibirInformacoesVeiculo();
        }

        // Criando objeto Motocicleta com entrada do usuário e tratamento de exceção
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

        Motocicleta moto = null;
        try {
            moto = new Motocicleta(marcaMoto, modeloMoto, anoMoto, tipoGuidãoMoto);
            System.out.println("\n--- Motocicleta Criada ---");
            moto.exibirInformacoesVeiculo();
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao criar Motocicleta: " + e.getMessage());
            moto = new Motocicleta(marcaMoto, modeloMoto, 2015, tipoGuidãoMoto); // Tentando criar com ano válido
            System.out.println("\n--- Motocicleta Criada com ano padrão (2015) devido ao erro ---");
            moto.exibirInformacoesVeiculo();
        }

        // Testando o método setAno do Carro com entrada do usuário e tratamento de
        // exceção
        System.out.println("\n--- Testando setAno do Carro ---");
        System.out.print("Digite um novo ano para o carro: ");
        int novoAnoCarro = scanner.nextInt();
        try {
            carro.setAno(novoAnoCarro);
            System.out.println("Ano do carro atualizado para: " + carro.getAno());
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao tentar definir o ano do carro: " + e.getMessage());
        }

        // Testando o método setNumeroDePortas do Carro com entrada do usuário e
        // tratamento de exceção
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
        if (veiculoGenerico != null) {
            veiculoGenerico.exibirInformacoesVeiculo();
        }
        System.out.println("\nCarro:");
        if (carro != null) {
            carro.exibirInformacoesVeiculo();
        }
        System.out.println("\nMotocicleta:");
        if (moto != null) {
            moto.exibirInformacoesVeiculo();
        }

        scanner.close();
    }
}