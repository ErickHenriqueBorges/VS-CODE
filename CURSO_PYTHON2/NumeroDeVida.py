datadenascimento= input("Iforme sua data de nascimeto, Por favor na ordem = DDMMAAA\n")
def numerodavida(data):
    somadadata=0
    for caracter in data:
        if caracter.isdigit():## verificação de digito inteiro
            somadadata+= int(caracter)
        else:
            print(F"\nO {caracter} Nao e considerado um numero")
            return None ## tirando a posibilidade de dar um erro
    while somadadata>=10:
        somatemporaria=0
        for caracter in str(somadadata):
            somatemporaria+= int(caracter)
        somadadata = somatemporaria
    return somadadata
resultadofinal= numerodavida(datadenascimento)
if resultadofinal is not None:
    print (F"\nSeu numero da vida e {resultadofinal}")