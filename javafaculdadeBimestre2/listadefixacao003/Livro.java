public class Livro extends BaseItem {
    private String autor;
    public Livro(String titulo, String ano,String autor){
        super(titulo, ano);
        this.autor=autor;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Autor : "+ this.autor);
    }
    


    
}
