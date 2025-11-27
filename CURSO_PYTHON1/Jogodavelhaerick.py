from random import randrange

# ======== MOSTRAR TABULEIRO ========
def mostrarTabuleiro(tabuleiro):
    print("+-------+-------+-------+")
    for linha in tabuleiro:
        print("|       |       |       |")
        print(f"|   {linha[0]}   |   {linha[1]}   |   {linha[2]}   |")
        print("|       |       |       |")
        print("+-------+-------+-------+")


# ======== VERIFICAR VENCEDOR ========
def verificandoVencedor(tabuleiro, simbolo):
    for linha in tabuleiro:
        if all(casa == simbolo for casa in linha):
            return True
    for coluna in range(3):
        if all(tabuleiro[i][coluna] == simbolo for i in range(3)):
            return True
    if all(tabuleiro[i][i] == simbolo for i in range(3)) or all(tabuleiro[i][2 - i] == simbolo for i in range(3)):
        return True
    return False


# ======== VERIFICAR EMPATE ========
def tabuleiroPreenchido(tabuleiro):
    for linha in tabuleiro:
        for casa in linha:
            if casa not in ['X', 'O']:
                return False
    return True


# ======== CONVERTER NÚMERO EM POSIÇÃO ========
def localizacao(numero):
    numero -= 1
    return (numero // 3, numero % 3)


# ======== JOGADA DO JOGADOR ========
def jogadaPlayer(tabuleiro):
    while True:
        try:
            jogada = int(input("Digite o número do campo (1–9): "))
        except ValueError:
            print(" Por favor, insira um número válido.")
            continue

        if jogada < 1 or jogada > 9:
            print(" O número deve estar entre 1 e 9.")
            continue

        linha, coluna = localizacao(jogada)
        if tabuleiro[linha][coluna] in ['X', 'O']:
            print(" Campo já preenchido, escolha outro.")
            continue

        tabuleiro[linha][coluna] = 'O'
        break



def computador(tabuleiro):
    print("💻 O computador está pensando...")

    
    def espacos_vazios():
        posicoes = []
        for i in range(3):
            for j in range(3):
                if tabuleiro[i][j] not in ['X', 'O']:
                    posicoes.append((i, j))
        return posicoes

    
    for (i, j) in espacos_vazios():
        copia = [linha[:] for linha in tabuleiro]
        copia[i][j] = 'X'
        if verificandoVencedor(copia, 'X'):
            tabuleiro[i][j] = 'X'
            return

    
    for (i, j) in espacos_vazios():
        copia = [linha[:] for linha in tabuleiro]
        copia[i][j] = 'O'
        if verificandoVencedor(copia, 'O'):
            tabuleiro[i][j] = 'X'
            return

    
    if tabuleiro[1][1] not in ['X', 'O']:
        tabuleiro[1][1] = 'X'
        return

    
    for (i, j) in [(0, 0), (0, 2), (2, 0), (2, 2)]:
        if tabuleiro[i][j] not in ['X', 'O']:
            tabuleiro[i][j] = 'X'
            return

    
    for (i, j) in espacos_vazios():
        tabuleiro[i][j] = 'X'
        return



def main():
    tabuleiro = [[str(3 * l + c + 1) for c in range(3)] for l in range(3)]
    tabuleiro[1][1] = 'X'  

    while True:
        mostrarTabuleiro(tabuleiro)

        if verificandoVencedor(tabuleiro, 'X'):
            print("o erick venceu! Fim de jogo.")
            break

        if tabuleiroPreenchido(tabuleiro):
            print("Deu velha!")
            break

        jogadaPlayer(tabuleiro)
        mostrarTabuleiro(tabuleiro)

        if verificandoVencedor(tabuleiro, 'O'):
            print("Você venceu! Parabéns!")
            break

        if tabuleiroPreenchido(tabuleiro):
            print("Deu velha!")
            break

        computador(tabuleiro)


if __name__ == "__main__":
    main()
