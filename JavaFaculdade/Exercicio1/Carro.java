package Exercicio1;
public class Carro {// somente uma class public por arquivo;
    private String marca;
    private String modelo;
    private int ano;


public void exibirInfo(){// isso sao os metodos;
    System.out.println("marca ="+marca);
    System.out.println("modelo ="+modelo);
    System.out.println("ano = "+ ano);
}
public void alterar( String marca, String modelo, int ano){
    this.marca=marca;
    this.modelo=modelo;
    this.ano=ano;
    //this serve para indicar qual pertence a class
}


}
