package exercicio16;

public class Veiculos {
    private String placa;
    private int ano;

    public Veiculos(){

    }
    public Veiculos(String placa, int ano){
        this.placa=placa;
        this.ano=ano;
    }
    public void setPlaca(String placa){
        this.placa=placa;

    }
    public void setAno(int ano){
        this.ano=ano;
    }
    public void setAno(String ano){
    }
    public String getPlaca(){
        return this.placa;
    }
    public int getAno(){
        return this.ano;
    }
    public void exibirDados(){
        System.out.println("----------------DADOS DO VEICULO----------------");
        System.out.println("Placa :"+this.placa);
        System.out.println("Ano :"+this.ano);
    }
}
