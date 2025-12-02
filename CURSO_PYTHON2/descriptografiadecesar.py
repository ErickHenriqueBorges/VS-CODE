mensagem=input(" informe a mensagem que deseja desptografar\n")
mensagemdesptografada=""
def hack( caracter):## no curso nao se usa a função nesse exemplo porem decidir fazer
    caracter= caracter.upper() ## estou mudando o a letra para maiuscula
    caracter= ord(caracter)-1## estou pegando qual o codigo da letra,e subtraindo um
    if caracter < ord("A"):
        caracter= ord("Z")
    caracter= chr(caracter)
    return caracter

for caracter in mensagem :
    if caracter == " ":
        mensagemdesptografada+= " "
    if  not caracter.isalpha(): ## estou fazendo a verificação se o elemento nao e uma letra, e caso seja ele sera ignorado 
        continue
    mensagemdesptografada += hack(caracter)
print (mensagemdesptografada)