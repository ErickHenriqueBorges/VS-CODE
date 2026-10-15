package exercicio002;

public class Vaga{
    private int numero;
    private boolean ocupada;
    private Aluno aluno; 



    public Vaga(int numero){
    this.numero=numero;
    this.ocupada=false;
    }

    public void ocuparVaga(Aluno aluno){
    this.aluno=aluno;
    this.ocupada=true;
    }

    public void liberarVaga(){
    this.aluno=null;
    this.ocupada=false;

    }

    public boolean verificarVaga(){
    return this.ocupada;
    }

    
}
