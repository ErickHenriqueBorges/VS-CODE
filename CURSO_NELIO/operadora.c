#include <stdio.h>
#include <math.h>
#include <string.h>

int main(){
    float tempo, tempo_com_juros;
    printf("informe o tempo ultilizado em minutos ");
    scanf("%f",&tempo);
        if (tempo==100){
            printf (" valor a ser pago = 50R$");}
        else {
            tempo_com_juros= ((tempo-100)*2)+50;
            printf ("Valor a ser pago = %.2f",tempo_com_juros);}

    return 0;
}
