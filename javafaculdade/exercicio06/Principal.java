package exercicio06;
public class Principal {
    public static void main(String[] args) {
        contaBancaria minhaConta= new contaBancaria();
      
        minhaConta.verificar("David");
        minhaConta.verificar("Erick");
        minhaConta.depositar(200.0);
        minhaConta.sacar(250.0);
        minhaConta.sacar(150.0);
        minhaConta.exibirSaldo();

        
    }
}
