package Q10;

public abstract class MembroEquipe {
    String nome;
    String projeto;

    public MembroEquipe(String nome, String projeto) {
        this.nome = nome;
        this.projeto = projeto;
    }

    public abstract String trabalhar();

    public String obterDetalhes() {
        return "Nome: " + nome + ", Projeto: " + projeto;
    }
    public String getNome() {
        return nome;
    }
    public String getProjeto() {
        return projeto;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
}