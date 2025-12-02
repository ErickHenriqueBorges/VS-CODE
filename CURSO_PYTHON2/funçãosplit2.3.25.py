def ericksplit(s):
    if s == "":
        return []
    
    resultado = []
    palavra = ""
    
    for caractere in s:
        if caractere.isspace():  # se for espaço em branco (espaço, tab, etc)
            if palavra != "":
                resultado.append(palavra)
                palavra = ""
        else:
            palavra += caractere
    
    # adicionar última palavra, se existir
    if palavra != "":
        resultado.append(palavra)
    
    return resultado
print(ericksplit("To be or not to be, that is the question"))
print(ericksplit("To be or not to be,that is the question"))
print(ericksplit("   "))
print(ericksplit(" abc "))
print(ericksplit(""))