public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GERENCIAMENTO DE BIBLIOTECA ===\n");

        // 1. Instanciando a Biblioteca
        Blibioteca biblioteca = new Blibioteca();

        // 2. Criando instâncias de Livros
        System.out.println("--- Criando Livros ---");
        Livro livro1 = new Livro("O Senhor dos Anéis", "1954", "J.R.R. Tolkien");
        Livro livro2 = new Livro("Dom Casmurro", "1899", "Machado de Assis");

        // 3. Criando instâncias de Revistas
        System.out.println("--- Criando Revistas ---");
        Revista revista1 = new Revista("National Geographic", "2023", "Edição nº 280");
        Revista revista2 = new Revista("Scientific American", "2024", "Edição Especial Vol. 12");

        // 4. Adicionando os itens na Biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarRevista(revista1);
        biblioteca.adicionarRevista(revista2);
        System.out.println("Itens adicionados com sucesso à biblioteca!\n");

        // 5. Testando o Polimorfismo e exibindo as informações de cada objeto individualmente
        System.out.println("--- Exibindo Informações Detalhadas ---");
        
        System.out.println("[Dados do Livro 1]");
        livro1.exibirInfo();
        System.out.println();

        System.out.println("[Dados da Revista 1]");
        revista1.exibirInfo();
        System.out.println();
    }
}
