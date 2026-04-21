package exercicio11;

public class Livro {
    private String escritor;
    private int tag;

    public Livro(String escritor, int tag){
        this.escritor=escritor;
        this.tag=tag;
    }
    public void getEscritor(){
        System.out.print("Nome do escritor: "+this.escritor);
    }
    public void getTag(){
        System.out.print("Numero da Tag: "+this.tag);
    }
    public void exibirInfo(){
        System.out.println("Nome do escritor : "+this.escritor);
        System.out.println("Numero da Tag : "+this.tag);

    }
}
