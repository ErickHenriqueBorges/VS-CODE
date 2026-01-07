## as linhas do arquivo estao sendo trasformanda em lista( cada palavra se torna um objeto de lista e cada linha vira uma nova lista)

from os import strerror


try:
    character_counter = line_counter = 0
    stream = open('text.txt', 'rt')
    line = stream.readline()## esotu lendo uma linha de um texto 
    while line != '':
        line_counter += 1
        for char in line:
            print(char, end='')
            character_counter += 1
        line = stream.readline()## estuu lendo a proxima linha do codigo
    stream.close()
    print("\n\nCharacters in file:", character_counter)
    print("Lines in file:     ", line_counter)
except IOError as e:
    print("I/O error occurred:", strerror(e.errno))
    


## este segundo modo eu vou transformar o arquio todo em uma lista(cada linha vai virar um objeto de um lista)
from os import strerror

try:
    ccnt = lcnt = 0
    s = open('text.txt', 'rt')
    lines = s.readlines(20)
    while len(lines) != 0:
        for line in lines:
            lcnt += 1
            for ch in line:
                print(ch, end='')
                ccnt += 1
        lines = s.readlines(10)
    s.close()
    print("\n\nCharacters in file:", ccnt)
    print("Lines in file:     ", lcnt)
except IOError as e:
    print("I/O error occurred:", strerror(e.errno))
    