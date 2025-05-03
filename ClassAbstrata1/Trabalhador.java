package ClassAbstrata1;

/*
 * 
Crie uma hierarquia de classes que represente **trabalhadores** de uma empresa.

- A classe abstrata `Trabalhador` possui os atributos:
  - `nome` (não pode ser nulo ou vazio),
  - `salarioBase` (deve ser maior que zero).

- Os métodos abstratos:
  - `calcularSalarioMensal()`: retorna o salário final do trabalhador.
  - `descricaoTrabalho()`: retorna uma string com a descrição do trabalho.

- Crie duas subclasses:
  - `TrabalhadorCLT`: recebe um bônus fixo de R$ 500 se o salário base for maior que R$ 3000.
  - `TrabalhadorAutonomo`: recebe 80% do salário base como valor final, mas se for menor que R$ 1500, recebe um adicional de R$ 200.

 */
public abstract class Trabalhador {
    private String nomeTrab;
    private double salarioBase;



public Trabalhador (){
}

public Trabalhador (String nome, double salarioBase){
  this.nomeTrab = nomeTrab;
  this.salarioBase = salarioBase;
}

public String getNomeTrab() {
    return nomeTrab;
}
public void setNomeTrab(String nomeTrab) {
    this.nomeTrab = nomeTrab;
}
public double getSalarioBase() {
    return salarioBase;
}
public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
}

public abstract void calcularSalarioMensal();
public abstract void descricaoTrabalho();




}