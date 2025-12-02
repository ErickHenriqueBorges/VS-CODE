digitos = {
0: [
        " .....",
        " .   .",
        " .   .",
        " .   .",
        " .....",
    ],

1: [   ".",
       ".",
       ".",
       ".", 
       ".", 
    ],

    2: [
        " .....",
        "     .",
        " .....",
        " .    ",
        " .....",
    ],

    3: [
        " .....",
        "     .",
        " .....",
        "     .",
        " .....",
    ],

    4: [
        " .   .",
        " .   .",
        " .....",
        "     .",
        "     .",
    ],
    5: [
        " .....",
        " .    ",
        " .....",
        "     .",
        " .....",
    ],

    6: [
        " .....",
        " .    ",
        " .....",
        " .   .",
        " .....",
    ],

    7: [
        " .....",
        "     .",
        "     .",
        "     .",
        "     .",
    ],

    8: [
        " .....",
        " .   .",
        " .....",
        " .   .",
        " .....",
    ],

    9: [
        " .....",
        " .   .",
        " .....",
        "     .",
        " .....",
    ],
}
numero = input("informe o numero que deseja ver em pontos\n")
for elemento in range(5): ##pois cada elemento da lista e composto por 5 elementos
    elemento_saida = [] # foi criada para amarzear os dados de uma elemento
    for d in numero: ## e feito para percorrer cada digito do numero digitado, por isso pegamos os numero em str
        elemento_saida.append(digitos[int(d)][elemento])## estou juntando todos os elementos dentro dessa lista
    print(" ".join(elemento_saida))
