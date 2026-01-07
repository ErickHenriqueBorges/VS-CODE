sudoku = []

for i in range(9):
    entrada = input("Digite 9 dígitos da linha do Sudoku: ")
    linha = [int(d) for d in entrada]  
    sudoku.append(linha)  

def verificacao(sudoku):
    numeros = set(range(1, 10))

    for i, linha in enumerate(sudoku):
        if set(linha) != numeros:
            print(f"Erro na linha {i+1}")
            return False

    for c in range(9):
        coluna = [sudoku[r][c] for r in range(9)]
        if set(coluna) != numeros:
            print(f"Erro na coluna {c+1}")
            return False

    for sr in range(0, 9, 3):
        for sc in range(0, 9, 3):
            bloco = []
            for r in range(sr, sr + 3):
                for c in range(sc, sc + 3):
                    bloco.append(sudoku[r][c])
            if set(bloco) != numeros:
                print(f"Erro no bloco começando na linha {sr+1}, coluna {sc+1}")
                return False

    return True

if verificacao(sudoku):
    print("Parabéns! Este é um Sudoku válido!")
else:
    print("Ops! Este Sudoku não é válido. Confira os erros acima.")
