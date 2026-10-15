public class Main{
    public static void main(String[] args) {
        RecHumanos rh = new RecHumanos();

        // 2. Criando funcionários CLT
        System.out.println("--- Contratando Funcionários CLT ---");
        FuncionarioClt funcClt1 = new FuncionarioClt("Alice", 500.0f);
        FuncionarioClt funcClt2 = new FuncionarioClt("Bob Souza", 300.0f);
        
        rh.contratarClt(funcClt1);
        rh.contratarClt(funcClt2);

        // 3. Criando funcionários PJ
        System.out.println("\n--- Contratando Funcionários PJ ---");
        FuncionarioPj funcPj1 = new FuncionarioPj("Carlos Oliveira", 10000.0f);
        FuncionarioPj funcPj2 = new FuncionarioPj("Diana Costa", 6000.0f);
        
        rh.contratarPj(funcPj1);
        rh.contratarPj(funcPj2);

        // 4. Imprimindo a lista de funcionários e seus respectivos salários calculados
        System.out.println("\n--- Listagem de Funcionários ---");
        rh.imprimirFuncionarios();

        // 5. Imprimindo a folha de pagamento
        System.out.println("\n--- Demonstrativo da Folha de Pagamento ---");
        rh.imprimirFolha();
    }

}