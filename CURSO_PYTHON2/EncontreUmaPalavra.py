palavra = input("Digite a palavra: ")
string = input("Digite a segunda string: ")
def verifica_ordem(palavra, string):
    palavra = palavra.lower() 
    string = string.lower()## converti ambas para minusculo para os caracteres nao serem tratados diferentes

    pos = 0
    for letra in palavra:
        pos = string.find(letra, pos)## eu estou verificando se a letra esta na posição x 
        if pos == -1:## caso a letra nao esteja na posicao indicada o find vai retornar o -1
            return "Não"
        else:## caso esteja ele ira verificar na proxima poisição
            pos += 1
    return "Sim"

resultado = verifica_ordem(palavra, string)
print(f"Os caracteres da palavra estão na string na mesma ordem? {resultado}")