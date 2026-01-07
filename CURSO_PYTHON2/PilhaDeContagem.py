class stack:
    def __init__(objeto):
        objeto.__lista = []

    def push(objeto, valor):  # inserindo um valor no topo da pilha
        objeto.__lista.append(valor)

    def pop(objeto):  # excluindo o último valor da pilha
        valor = objeto.__lista[-1]
        del objeto.__lista[-1]
        return valor

class contadorstack(stack):
    def __init__(objeto):
        stack.__init__(objeto)
        objeto.__pop_contador = 0   #  criando o contador de pops
        objeto.__push_contador = 0  # criando o contador de pushes

    def contadordepop(objeto):
        return objeto.__pop_contador

    def contadordepush(objeto):
        return objeto.__push_contador

    def push(objeto, valor):
        objeto.__push_contador += 1
        stack.push(objeto, valor)

    def pop(objeto):
        objeto.__pop_contador += 1
        return stack.pop(objeto)


objetodeinicializacao = contadorstack()

for i in range(100):
    objetodeinicializacao.push(i)
    objetodeinicializacao.pop()

print("Pushes:", objetodeinicializacao.contadordepush())  
print("Pops:", objetodeinicializacao.contadordepop())

