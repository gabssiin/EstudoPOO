package Q16;

import java.util.ArrayList;
import java.util.List;

class Prato {
    String nome;
    List<Ingrediente> ingredientes;

    public Prato(String nome) {
        this.nome = nome;
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarIngrediente(Ingrediente ingrediente) throws IngredienteInvalidoException {
        if (ingrediente == null) {
            throw new IngredienteInvalidoException("Erro: Não é possível adicionar um ingrediente nulo.");
        }
        this.ingredientes.add(ingrediente);
    }

    public String listarIngredientes() {
        if (ingredientes.isEmpty()) {
            return "O prato " + nome + " não possui ingredientes.";
        }
        StringBuilder lista = new StringBuilder("Ingredientes do prato " + nome + ":\n");
        for (Ingrediente ingrediente : ingredientes) {
            lista.append("- ").append(ingrediente.informar()).append("\n");
        }
        return lista.toString();

    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    public String getNome() {
        return nome;
    }
    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}