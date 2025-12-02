mensagem = input("Informe a mensagem que deseja criptografar: ")
intervalo = int(input("Informe o intervalo que deseja (entre 1 e 25): "))
while intervalo < 1 or intervalo > 25:
    print("Intervalo inválido! Digite um valor entre 1 e 25.")
    intervalo = int(input("Informe novamente o intervalo: "))

from modolodemelhoriadecesar import melhoria
print("A mensagem criptografada = ",melhoria(mensagem,intervalo))