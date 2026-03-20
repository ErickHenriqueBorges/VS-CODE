package exerciciodefixar.ex003;

public class Pessoa {
    private final String nome; // lembrando que isso deixa o atributo imutavel;
    private int idade;
    public Pessoa(String nome, int idade){
        this.idade=idade;
        this.nome=nome;
    }
    public void getdados(){
        System.out.print("\nNome :"+this.nome);
        System.out.println("\nIdade :"+this.idade);
        System.out.print("Maior de idade :"+verificador());
    }
    public boolean verificador(){
        return this.idade>=18;
    }

    public int getidade() {
        return this.idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }
    
}


