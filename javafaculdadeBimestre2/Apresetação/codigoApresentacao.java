import java.util.ArrayList;
import java.util.List;

public class codigoApresentacao {
    public static void main(String[] args) {
        
        // 1. CRIAR a lista
        // Criamos uma lista que vai armazenar nomes (Strings)
        List<String> frutas = new ArrayList<>();
        System.out.println("--- Lista Criada ---");

        // 2. INSERIR elementos (Adicionar)
        frutas.add("Maçã");       // Índice 0
        frutas.add("Banana");     // Índice 1 
        frutas.add("Morango");    // Índice 2
        frutas.add("Abacaxi");    // Índice 3
        System.out.println("Após inserir: " + frutas);
        

        // 3. ALTERAR um elemento (Atualizar)
        // Vamos mudar "Banana" (índice 1) para "Melancia"
        frutas.set(1, "Melancia");
        System.out.println("Após alterar o índice 1: " + frutas);
        

        // 4. PESQUISAR elementos
        // Busca por conteúdo (retorna true ou false)
        boolean temMorango = frutas.contains("Morango");
        System.out.println("Tem Morango na lista? " + temMorango);

        // Busca pelo índice de um elemento (retorna a posição ou -1 se não existir)
        int posicaoAbacaxi = frutas.indexOf("Abacaxi");
        System.out.println("O Abacaxi está na posição (índice): " + posicaoAbacaxi);

        // Pegar um elemento específico pelo índice
        String primeiraFruta = frutas.get(0);
        System.out.println("A fruta no índice 0 é: " + primeiraFruta);

        // 5. REMOVER elementos
        // Removendo pelo nome do elemento
        frutas.remove("Morango"); 
        // Removendo pelo índice (vamos remover o que sobrou no índice 0, que é "Maçã")
        frutas.remove(0); 

        System.out.println("Após as remoções: " + frutas);
        
        // BÔNUS: Saber o tamanho atual da lista
        System.out.println("Tamanho final da lista: " + frutas.size());
    }
}