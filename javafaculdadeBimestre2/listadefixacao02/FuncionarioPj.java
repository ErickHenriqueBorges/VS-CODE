public class FuncionarioPj extends Funcionario {
    public FuncionarioPj(String nome, Float salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public Float calcularSalario() {
        return super.getSalarioBase()*1.10f;
    }
    

}
