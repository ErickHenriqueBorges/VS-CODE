numeros = input (" informe os numeros que desejar sendo separados pelo espaço\n")
listadenumeros =  numeros.split()
total = 0
try:
    for elemento in listadenumeros:
        total += float(elemento)
    print (total , "e o total da soma dos numeros inseridos")
except:
    print(elemento, "Não e um numero")
