#include <stdio.h> // declaraçao de biblioteca;
#include <math.h> 
#include <string.h>

#define TAMANHO 3 //definindo uma variavel com um valor constante que no caso e o tamanho do tabuleiro;

char tabuleiro[TAMANHO][TAMANHO];
void criandotabuleiro(){
    for(int i=0;i < TAMANHO;i++) // vai percorrer as linhas 
        for(int j=0;j < TAMANHO;j++){ 
            tabuleiro[i][j]= ' ';} // vai percorrer as colunas no total saõ duas dimensoes
}
void imprimindotabuleiro(){
    printf("\n");
     for(int i=0;i < TAMANHO;i++){
        for(int j=0;j < TAMANHO;j++){
            printf(" %c ", tabuleiro[i][j]); // imprime o tabuleiro 
            if (j < TAMANHO - 1) printf("|");   // imprime as divisórias verticais 
        }
        printf("\n");// pulando uma linha 
        if (i < TAMANHO - 1) printf("---|---|---\n"); // linha horizontal
    }
    printf("\n");
}

char Vencedor() {
    // Linhas e colunas
    for (int i = 0; i < TAMANHO; i++) {
        if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][0] != ' ')
            return tabuleiro[i][0];
        if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i] && tabuleiro[0][i] != ' ')
            return tabuleiro[0][i];
    }
    
    if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != ' ')
        return tabuleiro[0][0];
    if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != ' ')
        return tabuleiro[0][2];
    
    return ' ';
}int empate() {
    for (int i = 0; i < TAMANHO; i++)
        for (int j = 0; j < TAMANHO; j++)
            if (tabuleiro[i][j] == ' ')
                return 0;
    return 1;
}
int main() {
    int linha, coluna, jogador = 1;
    char simbolo, vencedor;

    criandotabuleiro();
 while (1) {
        imprimindotabuleiro();
        simbolo = (jogador == 1) ? 'X' : 'O';

        printf("Jogador %d (%c), escolha linha e coluna (0-2): ", jogador, simbolo);
        scanf("%d %d", &linha, &coluna);

        if (linha < 0 || linha >= TAMANHO || coluna < 0 || coluna >= TAMANHO || tabuleiro[linha][coluna] != ' ') {
            printf("Jogada inválida! Tente novamente.\n");
            continue;
        }tabuleiro[linha][coluna] = simbolo;

        vencedor = Vencedor();
        if (vencedor != ' ') {
            imprimindotabuleiro();
            printf("Jogador %d (%c) venceu!\n", jogador, simbolo);
            break;
        }

        if (empate()) {
            imprimindotabuleiro();
            printf("Empate!\n");
            break;
        }

        jogador = (jogador == 1) ? 2 : 1;
    }

    return 0;
}