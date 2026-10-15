public class BaseItem {
    private String titulo;
    private String ano;
    
    public BaseItem(String titulo, String ano){
        this.titulo=titulo;
        this.ano=ano;
    }
    public void exibirInfo(){
        System.out.println("Titulo : "+this.titulo);
        System.out.println("Ano : "+this.ano);
        
    }
    
    
}
