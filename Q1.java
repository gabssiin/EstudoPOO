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
        // Cria uma nova instância de Cachorro e atribui à variável cachorro
        cachorro = new Cachorro();
        // Cria uma nova instância de Gato e atribui à variável gato
        gato = new Gato();
    }

    // Método para fazer os animais no zoológico emitirem seus sons
    public void fazerSons() {
        // Imprime uma mensagem indicando que estamos no zoológico
        System.out.println("No zoológico:");
        // Chama o método som() do objeto Cachorro para que ele faça seu som
        cachorro.som();
        // Chama o método som() do objeto Gato para que ele faça seu som
        gato.som();
    }
}

// Classe Q1 que contém o método main para executar o programa
public class Q1 {
    // Método main, o ponto de entrada do programa
    public static void main(String[] args) {
        // Criando instâncias das classes
        Animal animalGenerico = new Animal(); // Cria uma instância da classe Animal
        Cachorro meuCachorro = new Cachorro(); // Cria uma instância da classe Cachorro
        Gato meuGato = new Gato(); // Cria uma instância da classe Gato
        Zoologico meuZoologico = new Zoologico(); // Cria uma instância da classe Zoologico

        // Testando os métodos som()
        System.out.println("Testando sons individuais:"); // Imprime uma mensagem indicando o teste
        animalGenerico.som();  // Chama o método som() do animal genérico
        meuCachorro.som();      // Chama o método som() do cachorro
        meuGato.som();         // Chama o método som() do gato

        // Testando o zoológico
        meuZoologico.fazerSons(); // Chama o método fazerSons() do zoológico para que os animais façam seus sons
    }
}