package ClassAbstrata1;

public class TrabalhadorCLT extends Trabalhador{

    public TrabalhadorCLT(){
    };
    public TrabalhadorCLT(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalarioMensal(){
       if (getSalarioBase() > 3000) {
            setSalarioBase(getSalarioBase() + 500);
       } else {
        System.out.println("Erro");
       }
    }

    @Override
    public void descricaoTrabalho(){
        System.out.println("Esse trabalhador é CLT"); 

    }
}
