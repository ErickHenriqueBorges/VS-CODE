
def melhoria (mensagem,intervalo):
    mensagemcifra=""
    for caracter in mensagem:
        if caracter.isalpha():## verificando se e letra
             if caracter.islower():## VERIFICANDO se e minusculo 
                 elemento =  ord(caracter)- ord("a")
                 elemento =  (elemento+intervalo)%26
                 mensagemcifra+= chr(elemento + ord('a'))
             elif caracter.isupper():## verificando se e maiusculo
                 elemento =  ord (caracter)-ord('A')
                 elemento = (elemento+intervalo)%26
                 mensagemcifra+= chr(elemento+ord('A'))
        else: 
            mensagemcifra+= caracter

    return mensagemcifra
    