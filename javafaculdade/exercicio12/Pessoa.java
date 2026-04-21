package exercicio12;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;
    
    public Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
        this.pai=null;
        this.mae=null;
    }

    public Pessoa(String nome, int idade,Pessoa pai, Pessoa mae){// aqui eu estou usando o principio de Associação Recursiva
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }
    public void exibirArvore() {
        System.out.println("Pessoa: " + this.nome + " (" + this.idade + " anos)");
        
        if (this.pai != null) {
            System.out.println("  -> Pai: " + this.pai.nome+ " (" + this.pai.idade + " anos)");
        } else {
            System.out.println("  -> Pai: Desconhecido");
        }

        if (this.mae != null) {
            System.out.println("  -> Mãe: " + this.mae.nome + " (" + this.mae.idade + " anos)");
        } else {
            System.out.println("  -> Mãe: Desconhecida");
        }
    }
}
