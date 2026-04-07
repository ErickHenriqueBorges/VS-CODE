package exercicio09;

public class SistemaMercado {
    private String nome;
    private Float preco;
    private int quantidade;

    public SistemaMercado(String nome, Float preco, int quantidade){
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
    }
    public float calcularTotal() {
    float valorBruto = this.preco * this.quantidade;
    
    if (this.quantidade <= 10) {
        return valorBruto; 
    } 
    
    if (this.quantidade>=11 && this.quantidade<=20) {
        return valorBruto * 0.90f; 
    } 
    
    if (this.quantidade >= 21 && this.quantidade<=50) {
        return valorBruto * 0.80f; 
    } 
    
    
    return valorBruto * 0.75f; 
}

}

    

