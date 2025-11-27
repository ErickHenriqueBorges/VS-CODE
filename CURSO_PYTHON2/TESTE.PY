import modulo 
print( modulo.erick())
print( modulo.sucesso())
from random import random
print(f"{random():.2f}") ## aqui eu estou priorizando as duas primeiras casas decimais
print(round(random(),2))## aqui eu estou arredondado o numero e mostrando somente duas casas decimais
print(random()) ## estou mostrando um numero aleatorio 
for i in range(3):## função para mostrar tres numeros aleatorios 0<=x<=10
    print(f"{random():.1f}")
from random import randint

for i in range(3):##função que gera 3 numeros inteiros aleatoriso 
    print(randint(1,5), end=',') ## no intervalo de 1 a 10 
