palavra1= input("Iforme a primeira palavra\n")
palavra2= input("Informe a segunda palavra\n")
def verificaçao(palavra):
    lista=[]
    for caracter in palavra:
        if caracter.isalpha():
            caracter= caracter.upper()
            lista.append(caracter)
        else:
            palavraverificada1+= caracter
    
    return lista
lista1= verificaçao(palavra1)
lista2= verificaçao(palavra2)

if len( lista1)==0 or len( lista2)== 0:
    print("Nao sao anagramas")
else:
    lista1.sort()
    lista2.sort()

    if lista1 == lista2:
        print("Sao anagramas")
    else:
        print("Nao sao anagramas")