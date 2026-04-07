package exercicio04;
public class Carro {// somente uma class public por arquivo;
    private String marca;
    private String modelo;
    private int ano;

public Carro( String marca, String modelo, int ano){
    this.marca=marca;
    this.modelo=modelo;
    this.ano=ano;
    //this serve para indicar qual pertence a class
} 

public void exibirInfo(){// isso sao os metodos;
    System.out.println("marca ="+this.marca);
    System.out.println("modelo ="+this.modelo);
    System.out.println("ano = "+ this.ano);
}


}
