public class Funcionario {
    private String nome;
    private float salarioBase;

    public Funcionario(String nome, Float salarioBase){
        this.nome=nome;
        this.salarioBase=salarioBase;
    }
    public String getNome(){
        return this.nome;
    }
    public Float getSalarioBase(){
        return this.salarioBase;
    }
    public void setSalario(Float salario){
        this.salarioBase=salario;
    }
    public Float calcularSalario(){
       return this.salarioBase;
    }
}
