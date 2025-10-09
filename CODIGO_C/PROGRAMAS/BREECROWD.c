#include <stdio.h>
#include <math.h>
#include <string.h>
const int media=12;

int main (){
    float tempo,velocidade;
    float litros;
    printf("Informe o tempo gasto (em Horas)\n");
    scanf("%f",&tempo);
    printf ("Informe a velocidade media ultilizada na viagem em KM/H\n");
    scanf("%f",&velocidade);
    litros=(tempo*velocidade)/media;
    printf ("A quantidade de litros de combustivel calculada de acordo com os dados fornecidos = %.3f",litros);


    return 0 ;
}