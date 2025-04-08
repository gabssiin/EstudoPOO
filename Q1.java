// Classe base Animal
class Animal {
    // Método som() que representa o som genérico de um animal
    public void som() {
        // Imprime uma mensagem indicando um som genérico
        System.out.println("O animal emite um som genérico.");
    }
}

// Subclasse Cachorro que herda de Animal
class Cachorro extends Animal {
    // @Override indica que estamos sobrescrevendo o método som() da classe Animal
    @Override
    // Método som() sobrescrito para especificar o som do cachorro
    public void som() {
        // Imprime o som característico do cachorro
        System.out.println("O cachorro faz: Au Au");
    }
}

// Subclasse Gato que herda de Animal
class Gato extends Animal {
    // @Override indica que estamos sobrescrevendo o método som() da classe Animal
    @Override
    // Método som() sobrescrito para especificar o som do gato
    public void som() {
        // Imprime o som característico do gato
        System.out.println("O gato faz: Miau");
    }
}

// Classe Zoologico que contém instâncias de Cachorro e Gato
class Zoologico {
    // Variável de instância para armazenar um objeto Cachorro
    private Cachorro cachorro;
    // Variável de instância para armazenar um objeto Gato
    private Gato gato;

    // Construtor da classe Zoologico
    public Zoologico() {
        try {
            // Tentativa de criar uma nova instância de Cachorro
            cachorro = new Cachorro();
        } catch (Exception e) {
            // Captura qualquer exceção que ocorra durante a criação do Cachorro
            System.err.println("Erro ao criar o cachorro no zoológico: " + e.getMessage());
            // Define cachorro como null para indicar que a criação falhou
            cachorro = null;
        }

        try {
            // Tentativa de criar uma nova instância de Gato
            gato = new Gato();
        } catch (Exception e) {
            // Captura qualquer exceção que ocorra durante a criação do Gato
            System.err.println("Erro ao criar o gato no zoológico: " + e.getMessage());
            // Define gato como null para indicar que a criação falhou
            gato = null;
        }
    }

    // Método para fazer os animais no zoológico emitirem seus sons
    public void fazerSons() {
        // Imprime uma mensagem indicando que estamos no zoológico
        System.out.println("No zoológico:");
        // Verifica se o cachorro foi criado com sucesso antes de chamar seu método
        // som()
        if (cachorro != null) {
            // Chama o método som() do objeto Cachorro para que ele faça seu som
            cachorro.som();
        } else {
            System.out.println("O cachorro não está disponível.");
        }
        // Verifica se o gato foi criado com sucesso antes de chamar seu método som()
        if (gato != null) {
            // Chama o método som() do objeto Gato para que ele faça seu som
            gato.som();
        } else {
            System.out.println("O gato não está disponível.");
        }
    }
}

// Classe Q1 que contém o método main para executar o programa
public class Q1 {
    // Método main, o ponto de entrada do programa
    public static void main(String[] args) {
        // Criando instâncias das classes
        Animal animalGenerico = null;
        try {
            
            animalGenerico = new Animal(); // Cria uma instância da classe Animal
        } catch (Exception e) {
            System.err.println("Erro ao criar animal genérico: " + e.getMessage());
            animalGenerico = null; // Define como null em caso de erro
        }

        Cachorro meuCachorro = null;
        try {
            meuCachorro = new Cachorro(); // Cria uma instância da classe Cachorro
        } catch (Exception e) {
            System.err.println("Erro ao criar cachorro: " + e.getMessage());
            meuCachorro = null; // Define como null em caso de erro
        }

        Gato meuGato = null;
        try {
            meuGato = new Gato(); // Cria uma instância da classe Gato
        } catch (Exception e) {
            System.err.println("Erro ao criar gato: " + e.getMessage());
            meuGato = null; // Define como null em caso de erro
        }

        Zoologico meuZoologico = null;
        try {
            meuZoologico = new Zoologico(); // Cria uma instância da classe Zoologico
        } catch (Exception e) {
            System.err.println("Erro ao criar zoológico: " + e.getMessage());
            meuZoologico = null; // Define como null em caso de erro
        }

        // Testando os métodos som()
        System.out.println("\nTestando sons individuais:"); // Imprime uma mensagem indicando o teste
        if (animalGenerico != null) {
            animalGenerico.som(); // Chama o método som() do animal genérico
        }
        if (meuCachorro != null) {
            meuCachorro.som(); // Chama o método som() do cachorro
        }
        if (meuGato != null) {
            meuGato.som(); // Chama o método som() do gato
        }

        // Testando o zoológico
        System.out.println("\nTestando o zoológico:"); // Imprime uma mensagem indicando o teste do zoológico
        if (meuZoologico != null) {
            meuZoologico.fazerSons(); // Chama o método fazerSons() do zoológico para que os animais façam seus sons
        }
    }
}