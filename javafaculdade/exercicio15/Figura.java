package exercicio15;

public class Figura{
    private String cor;

    public Figura(String cor){
        this.cor=cor;
    }

    public void setCor(String cor){
        this.cor=cor;
    }
    public void getCor(){
        System.out.println("Cor atual :"+ this.cor);
    }
    
}
