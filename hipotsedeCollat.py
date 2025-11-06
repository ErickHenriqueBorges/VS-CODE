
x = int(input("Por favor informe um valor inteiro maior que zero\n "))
if x<= 0:
    x = int(input("Por favor informe um valor inteiro maior que zero\n"))
etapas=0
while x!=1:
    if x%2==0:
        x //= 2
    else :
        x = x*3+1 
    print(x)
    etapas+=1
    
print("\netapas =", etapas)
