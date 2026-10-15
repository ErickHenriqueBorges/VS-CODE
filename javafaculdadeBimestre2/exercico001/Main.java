import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int x=0; 
        int vet[]=new int[5];
        int vet2[]={4,32,78,0,7};
        int soma[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print(" informe Número " + (i + 1) + " do array: ");
            vet[i] = ler.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            soma[i] = vet[i] + vet2[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("valor Soma : "+ soma[i]);
        }
        ler.close();
    }
}
 