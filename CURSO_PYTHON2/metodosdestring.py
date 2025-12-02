print("AlPhA".capitalize())  
## deixa somente oprimeiro elemento maiusculo e os restantes minusculos, nao a efeito em elementos e nem em epaço vazio

print("abc".isalpha())  
## verifica se a string contem apenas letras

print('lambda30'.isalnum())  
## faz a verificação se a string so contem numero e letrar e nao caracteres

print("abc".islower())  
## verifica se todas as letras da string estão em minúsculo

print("ABC".isupper())  
## verifica se todas as letras da string estão em maiúsculo

print(" \t\n".isspace())  
## verifica se a string contem apenas espaços, tabs ou quebras de linha

print("Eta".find("ta"))  
## mesma função do endswith porem retorna 1 par verdadeiro e -1 para falso

print("python".replace("thon", "thon!"))  
## substitui todas as ocorrências de "thon" por "thon!" na string

print("python".rfind("o"))  
## retorna o índice da última ocorrência da substring "o", -1 se não encontrar

print("  hi".lstrip())  
## remove espaços em branco à esquerda da string

print("hi  ".rstrip())  
## remove espaços em branco à direita da string

print("phi  x     chi\npsi".split())  
## divide a string em uma lista usando o separador especificado 

print("*".join(["a","b"]))  
## une os elementos de uma lista ou iterável usando a string como separador

print("ABC".lower())  
## converte todas as letras da string para minúsculo

print("hello world".startswith("he"))  
## verifica se a string começa com os caracteres escolhidos, sensível a maiúsculas/minúsculas

if "epsilon".endswith("on"):  
    ## verifica se string termina com os elementos ecolhidos, ele diferencia maiusculo de minusculo
    print("yes")
else:
    print("no")

print("PyThOn".swapcase())  
## inverte maiúsculas para minúsculas e vice-versa na string

print("python programming".title())  
## deixa a primeira letra de cada palavra em maiúsculo e o restante em minúsculo

print("python".upper())  
## converte todas as letras da string para maiúsculo

print("²³".isdigit())  
## verifica se a string contem apenas dígitos (números, incluindo expoentes e superíndices)

