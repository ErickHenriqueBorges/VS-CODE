#include <stdio.h> 
#include <math.h>
#include <string.h>

int main(){
    float x1,x2,x3;
    printf("Primeiro valor:");
    scanf("%f",&x1);
    printf("Segundovalor:");
    scanf("%f",&x2);
    printf("Terceiro valor:");
    scanf("%f",&x3);
        if( x1<=x2 && x1<=x3)
            printf("MENOR = %.2f" , x1);
        else 
            if(  x2<=x1 && x2<=x3)
                printf(" MENOR = %.2f ",x2);
            else
               printf(" MENOR = %.2f ",x3);




    return 0;

}

