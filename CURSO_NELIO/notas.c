#include <stdio.h>
#include <math.h>
#include <string.h>

int main(){
    float nota1, nota2 , media;
    printf("BEM VINDO!\n");
    printf("informe a primeira nota\n");
    scanf("%f",&nota1);
    printf("informe a segunda nota\n");
    scanf("%f",&nota2);
    media=(nota1+nota2)/2;
    printf("NOTA FINAL = %.2f", media);
    
        if(media<60)
            printf("\nREPROVADO");
        else 
            printf("\nAPROVADO");

    return 0;

}