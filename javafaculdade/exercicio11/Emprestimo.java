package exercicio11;

public class Emprestimo {
    private Pessoa usuario;
    private Livro livroEmprestado;
    private String dataEmprestimo;

    public Emprestimo(Pessoa usuario, Livro livroEmprestado, String dataEmprestimo){
        this.dataEmprestimo=dataEmprestimo;
        this.livroEmprestado=livroEmprestado;
        this.usuario=usuario;
    }
    public void getEmprestimo(){
        System.out.println("---------------COMPROVANTE DE EMPRESTIMO---------------");
        this.usuario.exibirInfo();
        this.livroEmprestado.exibirInfo();
        System.out.println("Data emprestimo : "+this.dataEmprestimo);
        
    }
}
