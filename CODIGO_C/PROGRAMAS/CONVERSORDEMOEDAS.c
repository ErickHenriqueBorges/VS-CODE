#include <stdio.h>
#include <math.h>
#include <string.h>
#include <ctype.h>

int main (){
    float reais,conversao;
    int opcao;
    printf("informe um valor em R$\n");
    scanf( "%f",&reais);
    printf("\ninforme qual opção de conversao deseja: \n1-DOLAR(USD) \n2-EURO(EUR) \n3-IENE(JPY) \nATUALIZADA: 22/07/2025\n");
    scanf("%i",&opcao);    
    while ( opcao<1 || opcao>3){
        printf ( " Opção selecionada ainda nao foi cadastrada em banco de dados\n selecione uma opção cadastrada");
        printf("\ninforme qual opção de conversao deseja: \n1-DOLAR(USD) \n2-EURO(EUR) \n3-IENE(JPY) \nATUALIZADA: 22/07/2025\n");
        scanf("%i",&opcao);
    }
    switch (opcao){
    case 1: conversao=reais/5.56; printf(" %.2f (R$) = %.2f(US$)",reais,conversao);break;
    case 2: conversao=reais/6.54; printf(" %.2f (R$) = %.2f (€)",reais,conversao);break;
    case 3: conversao=reais/0.038; printf(" %.2f (R$) = %.2f (¥)",reais,conversao);break;
    }




    return 0;

}

