#include <stdio.h>
#include <math.h>
#include <string.h>

int main(){
    float precoproduto, quant, troco,valor;
    printf ("informe o valor unitario do produto: ");
    scanf ("%f",&precoproduto);
    printf("informe a quantidade do produto: ");
    scanf("%f",&quant);
    printf("informe o valor recebido: ");
    scanf("%f",&valor);
    troco=valor-(precoproduto*quant);
    printf("TROCO = %.2f",troco);
    return 0; 
}