mensagem = input("Informe a frase que deseja verificar se é palíndromo:\n")

mensagem_filtrada = ""
for elemento in mensagem: ## vou percorrer elemento por elemento dentro da mensagem
    if elemento.isalpha():## faço a verificaçao se o elemento e um letra
        mensagem_filtrada += elemento.upper()## altero a letra para maiusula para que sejam tratadas igualmente

if mensagem_filtrada == "":
    print("\nA string vazia ou sem letras não é considerada um palíndromo.")
else:
    mensagem_invertida = mensagem_filtrada[::-1]## inverti a frase e guardei em outra variavel
    if mensagem_filtrada == mensagem_invertida:
        print("\nÉ um PALÍNDROMO!")
    else:
        print("\nA mensagem não é um palíndromo.")