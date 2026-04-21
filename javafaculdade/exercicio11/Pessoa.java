package exercicio11;

public class Pessoa {
    private String nome;
    private String cpf;
    private int registro;
    
    public Pessoa(String nome, String cpf, int registro){
        this.nome=nome;
        this.cpf=cpf;
        this.registro=registro;
    }
    public void exibirInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF :"+this.cpf);
        System.out.println("Registro :"+this.registro);
    }
}
