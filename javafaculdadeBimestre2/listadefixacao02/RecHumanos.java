import java.util.ArrayList;
import java.util.List;
public class RecHumanos {
    private List<Funcionario> funcionarios;

    public RecHumanos(){
        this.funcionarios=new ArrayList<>();
    }

    public void contratarClt(FuncionarioClt funcionario){
        this.funcionarios.add(funcionario);
        System.out.println(funcionario.getNome());
        System.out.println("Cadastrado com sucesso ");
    }
    public void contratarPj(FuncionarioPj funcionario){
        this.funcionarios.add(funcionario);
        System.out.println(funcionario.getNome());
        System.out.println("Cadastrado com sucesso ");
    }
    public void imprimirFuncionarios(){
        for (Funcionario f : this.funcionarios) {
            System.out.println("-Nome " +f.getNome());
            System.out.println("-Salario " +f.calcularSalario());
           
        }
    }
    public void imprimirFolha(){
        for (Funcionario f : this.funcionarios) {
            float folha=0.0f;
            folha+=f.calcularSalario();
            System.out.println("FOlha total : "+folha);
            
        }
    }

}
