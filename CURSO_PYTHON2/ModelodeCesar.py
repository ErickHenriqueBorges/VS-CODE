mensagem=input("informe a mensagem que deseja criptografar\n")
hack=""
for caractere in mensagem:
    
    if caractere == " ":# para manter os espaços entre as palavras
        hack += " "
        continue
    if not caractere.isalpha(): ## verifica se nao e uma letra, caso nao seja ele pula para o proximo elemento
        continue
    caractere= caractere.upper()
    codigo=ord(caractere)+1 ## aqui eu estou pegando o codigo do elemento e somando mais um
    if codigo>ord('Z'):
        codigo= ord('A') ## estou garantindo que o a letra z nao va para o proximo e sim para a letra A
    codigo= chr(codigo)
    hack += codigo
print (F"A {mensagem} criptografada ficará: {hack}")
       
    
