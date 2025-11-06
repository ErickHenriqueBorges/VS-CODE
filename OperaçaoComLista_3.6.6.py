TamanhoDalista = int(input("iforme o tamanho da lista que deseja criar\n"))
lista=[0]*TamanhoDalista
print (lista)
for i in range(len(lista)):
    i = int(input("Informe a posição que deseja guardar o dado: "))
    valor= int(input("Informe o valor que deseja guardar: "))
    lista[i]= valor
    print (lista)

listaSemRepetidos=[]
for valor in lista:
    if valor not in listaSemRepetidos:
        listaSemRepetidos.append(valor)
print("lista original: ",lista)
print ("lista sem elementos repitidos:",listaSemRepetidos)
