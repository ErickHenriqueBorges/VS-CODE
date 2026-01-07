from os import strerror 

try:
    counter = 0 ## estou iniciando um contador de caracter 
    stream = open('text.txt', "rt") ## estou definindo uma variavel que vai amarzenar os dados do arquivo selecionado
    char = stream.read(1) ## estou definindo uma variavel que vai amarzenar caracter por caracter 
    while char != '': ## crio um loop para percorrer todo o arquivo 
        print(char, end='') ## estou imprimindo na tela o caracter, importante usar o end="" para nao pular linha
        counter += 1 ## apos eu imprimir na tela o caracter eu faço um incremento na variavel de contagem
        char = stream.read(1)## e chamo novamento um outro caracter, nao e necessario fazer o incremento na variavel stream pois a a função read ja ira pegar o proximo caracter 
    stream.close() ## estou fechanddo o arquivo apos ele ser ultizado
    print("\n\nCharacters in file:", counter)## imprimindo na tela a contagem de caracteres do arquivo
except IOError as e: ## caso de algo errado no codifo acima, sera acionado essa segunda parte do codigo
    print("I/O error occurred: ", strerror(e.errno))

## outra maneira de percorrer caracter por caracter do arquivo

from os import strerror

try:
    counter = 0
    stream = open('text.txt', "rt")
    content = stream.read()
    for char in content:
        print(char, end='')
        counter += 1
    stream.close()
    print("\n\nCharacters in file:", counter)
except IOError as e:
    print("I/O error occurred: ", strerror(e.errno))