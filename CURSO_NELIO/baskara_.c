#include <stdio.h>
#include <math.h>
#include <string.h>

int main(){
    float a,b,c,delta,positivo,negativo;
    printf("informe o valor do coeficiente A: ");
    scanf("%f",&a);
    printf("informe o valor do coeficiente B: ");
    scanf("%f",&b);
    printf("informe o valor do coeficiente C: ");
    scanf("%f",&c);
    delta= pow(b,2)-(4*a*c);
    printf("\nO valor de Delta = %.2f",delta);
    positivo = (-b + sqrt(delta))/(2*a);
    negativo = (-b - sqrt(delta))/(2*a);
    printf("\nX1 = %.2f\nX2 = %.2f",positivo,negativo);


    return 0;

}
