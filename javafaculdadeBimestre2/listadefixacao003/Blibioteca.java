import java.util.ArrayList;
import java.util.List;
public class Blibioteca {
    private List<BaseItem> itens;

    public Blibioteca(){
        this.itens=new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        this.itens.add(livro);
    }
    public void adicionarRevista(Revista revista){
        this.itens.add(revista);
    }
}
