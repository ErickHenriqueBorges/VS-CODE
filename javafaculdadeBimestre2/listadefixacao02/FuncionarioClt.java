public class FuncionarioClt extends Funcionario {
    

    public FuncionarioClt(String nome, Float salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public Float calcularSalario() {
        return super.getSalarioBase()*0.85f;
    }
    
    
    
}
