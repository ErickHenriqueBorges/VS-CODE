#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>
#include <string.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    int opcao;

    do{

    printf(" ==============================================\n");
    printf("_________________________________________________________________________\n");
    printf("              CALCULADORA DE ESTATÍSTICAS              \n");
    printf(" ==============================================\n");
    printf(" ______________________________________________\n");
    printf(" MENU PRINCIPAL:\n");
    printf(" 1. Calcular estatísticas basicas\n");
    printf(" 2. Encontrar maior e menor número\n");
    printf(" 3. Contar números pares e ímpares\n");
    printf(" 4. Tabuada personalizada\n");
    printf(" 5. Sair do sistema\n");
    printf(" ______________________________________________\n");
    printf("\n Digite sua opção: ");
    scanf("%d",&opcao);

    if(opcao == 1){
        int A,B,contagemv = 0,numerosrecusados=0;
        int i;
        float soma=0.0, media=0.0; 

        printf(" --- Estatísticas Básicas ---\n");
        printf(" Quantos números deseja inserir?\n");
        scanf("%d",&A);
        for (i = 1; i<=A; i++){
        printf("Digite o número %d (1 a 100): ",i);
        scanf("%d" ,&B);
        if(B<=0 || B>100){
        printf("AVISO: Número fora do intervalo! Sera ignorado.\n");
        numerosrecusados++;}

        else{
            soma += B;
            contagemv++;
        }}
        
        
        if (contagemv > 0) { // nao faz divisao por 0
            media=soma/contagemv;
        } else {
            media = 0.0f;
        }

        printf("--- Resultado ---\n");
        printf("Soma dos números válidos: %.2f\n",soma);
        printf ("Media dos números válidos: %.2f\n",media);
        printf ("Quantidade de números válidos: %d\n",contagemv);
        printf("Quantidade de números ignorados: %d\n\n",numerosrecusados);

    }
    
    
    if(opcao == 2){ 
        printf("--- Encontrar Maior e Menor---\n");
        printf("Digite números entre 1 e 100 (digite 0 para parar):\n");
        
        int numero;
        int maior = 0; 
        int menor = 0;
        int primeiro_valido = 0; 
        
        while (1) // loop sempre verdadeiro, portanto so saira no breaK
        {
            printf("Números: ");
            scanf("%d", &numero);
            if (numero == 0) { // break explicado em sala de aula
                break; 
            }
        
            if (primeiro_valido == 0) {
                maior = numero;
                menor = numero;
                primeiro_valido = 1; 
            } 

            else {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        } 

        printf("\n--- Resultados ---\n");
        
        if (primeiro_valido == 1) {
            int diferenca = maior - menor;
            printf("Maior número: %d\n", maior);
            printf("Menor número: %d\n", menor);
            printf("Diferença: %d\n", diferenca);
        } else {
            printf("Nenhum número válido foi digitado.\n");
        }
        printf("\n"); 
    }
    if (opcao==3){
       int numero;
        int cont_pares = 0;
        int cont_impares = 0;
        int total_validos = 0;
        
        printf("--- Contar Números Pares e Ímpares ---\n");
        printf("Digite números positivos (digite -1 para encerrar):\n");
        
        while (1) {
            printf("Número: ");
            scanf("%d", &numero);
            if (numero == -1) {
                break;}
            if (numero < 0) {
            continue;} //ignora números negativos sem aviso de acordo com os exemplos da lista, usando o continue explicado em sala

            total_validos++;
            
            if (numero % 2 == 0) {
                cont_pares++;
            } else {
                cont_impares++;
            }
        } 
        
        printf("\n--- Resultados ---\n");
        
        if (total_validos > 0) {
    
            float perc_pares = (float)cont_pares / total_validos * 100.0f;
            float perc_impares = (float)cont_impares / total_validos * 100.0f;
            
            printf("Números pares: %d (%.1f%%)\n", cont_pares, perc_pares);
            printf("Números ímpares: %d (%.1f%%)\n", cont_impares, perc_impares);
        } else {
            printf("Nenhum número positivo foi digitado.\n");
        }
    }
    if ( opcao==4){
         int num;
    int continuar = 1;

    printf("\n--- Tabuada Personalizada ---\n");

    while (continuar == 1) {
        printf("Digite um número entre 1 e 10: ");
        scanf("%d", &num);

        if (num < 1 || num > 10) {
            printf("Número fora do intervalo! Tente novamente.\n");
            continue;
        }

        printf("\nTabuada do %d:\n", num);
        for (int i = 1; i <= 10; i++) {
            printf("%d x %d = %d\n", num, i, num * i);
        }

        printf("\nDeseja ver outra tabuada? (1-Sim / 0-Não): ");
        scanf("%d", &continuar);
    }
    }

    }while(opcao!=5);
    
    printf("\n Encerrando Sistema...\n");
    printf("___________________________________________________________________________\n");
    printf(" Obrigado por utilizar a Calculadora Estatísticas!\n");
    
    return 0;
}