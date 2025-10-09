#include <stdio.h>
#include <math.h>
#include <string.h>
#include <ctype.h>

int main (){
    float temp,conversao;
    int opcao;
    printf ("informe a temperatura a graus C°\n");
    scanf("%f",&temp);
    printf("\ninforme qual opção de conversao deseja:\n1-Fahrenheit(°F) \n2-Kelvin(°K) \n3-Celsius (°C)\n");
    scanf("%i",&opcao);
    while( opcao<1||opcao>3){
        printf("\nopção informada nao cadastrada em banco de dados, tente novamente\ninforme qual opção de conversao deseja:\n1-Fahrenheit(°F) \n2-Kelvin(K) \n3-Celsius (°C)\n");
        scanf("%i",&opcao);}
    switch (opcao){
        case 1: conversao=(temp* 9/5) + 32; printf("%.2f(°C) = %.2f(°F)",temp,conversao);break;
        case 2: conversao= temp + 273.15; printf("%.2f(°C) = %.2f(°K)",temp,conversao);break;
        case 3: conversao= temp; printf("%.2f(°C) = %.2f(°C)",temp,conversao);break;
    }
    
    return 0;
}