#include <stdio.h>
#include <math.h>
#include <string.h>

int main(){
    char nome[100],invertido[100];
    int i=0,j=0,x=0;
    printf(" informe uma palavra\n");
    fgets(nome,sizeof(nome),stdin);
    nome[strcspn(nome, "\n")]='\0'; 
    x=strlen(nome)-1; 
    for(i=x;i>=0;i--){
        invertido[j]=nome[i];
        j++;}  
    invertido[j]='\0';
    printf("%s\ninvertido: \n%s",nome, invertido);
   


    return 0;

}   