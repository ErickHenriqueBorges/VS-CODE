from os import strerror 

nome_arquivo =  input(  "informe o nome do arquivo que deseja acessar:")
contagem={}
try:
    file=open(nome_arquivo,"rt") ## nome do arqivo de exemplo( Histograma.lab.4.38.txt )
    for linha in file:
        for caracter in linha.lower():
            if caracter.isalpha():
                contagem[caracter]=contagem.get(caracter,0)+1##.get procura dentro do dicionario quaso ache, retorna o valor armazenado, porem caso nao encontre acaba retornando um valor igual a zero
    for chave in sorted(contagem):
        print(chave, contagem[chave])
         
except IOError as e:
    print("ocorreu o seguinte erro:",strerror(e.errno))


## melhorando a leitura de historiograma de acordo com o curs
from os import strerror 

nome_arquivo =  input(  "informe o nome do arquivo que deseja acessar:")
contagem={}
try:
    file=open(nome_arquivo,"rt") ## nome do arqivo de exemplo( Histograma.lab.4.3.9.txt )
    for linha in file:
        for caracter in linha.lower():
            if caracter.isalpha():
                contagem[caracter]=contagem.get(caracter,0)+1##.get procura dentro do dicionario quaso ache, retorna o valor armazenado, porem caso nao encontre acaba retornando um valor igual a zero
    for chave, valor in sorted(contagem.items(), key=lambda item: item[1], reverse=True):
        print(chave, valor)
         
except IOError as e:
    print("ocorreu o seguinte erro:",strerror(e.errno))






