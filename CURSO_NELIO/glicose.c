#include <stdio.h>
#include <math.h>
#include <string.h>

int main(){
    float nivelglicose;
    printf (" informe o nivel de glicose do seu sangue: ");
    scanf("%f",&nivelglicose);
    if (nivelglicose<=100)
        printf("NORMAL");
    else if ( 100 <nivelglicose && nivelglicose<=140 )
        printf("Elevado");
    else 
        printf(" Diabetes");
return 0;

}