for ch in "john.smith@pythoninstitute.org":
    if ch=='@':
       break
    else :
        print(ch,end = " ")

print("\n ****SEGUNDA OPÇÃO DE CODIGO***** \n ")

# segunda opção********
resultado = ''
for ch in "john.smith@pythoninstitute.org":
    if ch=='@':
       break
    else :
        resultado += ch
print (resultado)