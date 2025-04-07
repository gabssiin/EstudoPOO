package Q3;

/*Q3: Sistema de Funcionários

Agora, vamos criar um sistema para organizar diferentes tipos de funcionários em uma empresa, incorporando métodos específicos para cada tipo.

Crie a classe base Funcionario com os atributos nome, salarioBase e o método calcularSalario(), que retorna o salário base.
Crie as subclasses Gerente, Desenvolvedor e Estagiario. Cada um terá uma regra própria para calcular o salário:
O Gerente: O salário é o salarioBase mais um bônus fixo.
O Desenvolvedor: O salário é o salarioBase multiplicado por um fator de produtividade.
O Estagiario: O salário é o salarioBase, sem adicionais.
Implemente a classe Empresa que gerencie uma lista de funcionários e tenha um método calcularFolhaDePagamento() para somar e exibir o salário de cada tipo de funcionário.
Crie uma Main para testar e manipular todos os objetos citados anteriormente.

 */

public class Funcionario {
    private String nomeFunc;
    private double salarioBaseFunc;

    public Funcionario() {
    }

    public Funcionario(String nomeFunc, double salarioBaseFunc) {
        this.nomeFunc = nomeFunc;
        this.salarioBaseFunc = salarioBaseFunc;
    }

    public String getNome() {
        return nomeFunc;
    }

    public double getSalarioBase() {
        return salarioBaseFunc;
    }

    public void setNome(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public void setSalarioBase(double salarioBaseFunc) {
        this.salarioBaseFunc = salarioBaseFunc;
    }

    public double calcularSalario() {
        return salarioBaseFunc;
    }

    public void exibirInformacoesFunc() {
        System.out.println("Nome do funcionário: " + nomeFunc);
        System.out.println("Salario base: " + salarioBaseFunc);

    }
}