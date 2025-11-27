numero =  int(input("informe o numero que deseja saber se e primo\n"))
def numeroPrimo(numero):
    if numero <= 1:
        return False  
    for i in range(2, int(numero ** 0.5) + 1): 
        if numero % i == 0:
            return False  
    else:
        return True  
    
print(f"O {numero} é primo:{numeroPrimo(numero)}")

