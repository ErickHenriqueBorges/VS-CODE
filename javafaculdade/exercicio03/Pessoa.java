package exercicio03;

public class Pessoa {
    private final String nome; // lembrando que isso deixa o atributo imutavel;
    private  final int idade;
    public Pessoa(String nome, int idade){
        this.idade=idade;
        this.nome=nome;
    }
    public void getdados(){
        System.out.print("\nNome :"+this.nome);
        System.out.println("\nIdade :"+this.idade);
    
    }
    public void verificador(){
        if (idade>=18){
            System.out.print("Maior de idade ");
        }
        else{
            System.out.print("Menor de idade ");
        }
        
    }

    
}


 