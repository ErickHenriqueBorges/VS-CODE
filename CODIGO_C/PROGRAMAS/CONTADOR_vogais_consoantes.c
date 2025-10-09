 #include <stdio.h>
 #include <math.h>
 #include <string.h>
 #include <ctype.h>

 int main (){
    char palavra[100];
    int vogais=0, consoantes=0;
    printf(" informe uma palavra que deseja saber quantidade de vogais e consoantes\n");
    fgets(palavra,sizeof(palavra),stdin);
    for(int i=0;palavra[i]!='\0';i++){
        if(isalpha(palavra[i])){
            if( palavra[i]=='a' || palavra[i] =='e' || palavra[i] =='i' || palavra[i] =='o' || palavra[i] =='u'){
            vogais++;}
            else{
            consoantes++;}}
    }
        
    printf(" \n vogais = %i \n consoantes = %i ",vogais,consoantes);



    return 0; 
}
 