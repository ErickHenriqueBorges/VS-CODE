public class Revista extends BaseItem{
    private String edicao;

    public Revista(String titulo, String ano, String edicao){
        super(titulo,ano);
        this.edicao=edicao;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Edição : "+ this.edicao);
    }
    
}
