from os import strerror
class StudentsDataException(Exception):
    pass

class BadLineException(StudentsDataException):
    pass

class FileEmptyException(StudentsDataException):
    pass


nome_arquivo = input("Nome do arquivo: ") ## estou pedindo o nome do arquivo que o professor deseja acessar 
alunos = {}## crio um dicionario para armazenar os dados e conseguir trabalhar com eles 

try:
    file = open(nome_arquivo, "rt") ## estou abrindo o arquivo (arquivoDeAvaliçaodealunos.txt)

    linhas = file.readlines()  ##estou retornando uma lista com as linhas do arquivo cada linha do arquivo e um elemento da lista 
    if not linhas:
        raise FileEmptyException("Arquivo vazio")## caso o  arquivo esteja vazio eu informo para o usuario

    for linha in linhas:## estou percorrendo linha por linha da lista
        partes = linha.split() ## trasformo cada linha em uma lista e cada string em elemento de lista
        if len(partes) != 3: ## caso o tamnha da linha seja diferente de 3 nome sobrenome e pontos, irei informar ao o usuario 
            raise BadLineException("Linha inválida")

        nome, sobrenome, pontos = partes
        pontos = float(pontos)## trasformo os pontos em float pois irei trabalhar com eles 

        chave = (nome, sobrenome)## metodo de acesso da lista
        alunos[chave] = alunos.get(chave, 0) + pontos ## funçao get ira procurar um dado refente ao nome e sobrenome caso exista ele retorna o valor pertencido e adiciona os pontos, caso nao exista ele cria uma elemento e os pontos

    file.close()## fechando o arquivo 

    for nome, sobrenome in sorted(alunos):
        print(nome, sobrenome, alunos[(nome, sobrenome )])

except Exception as e:
    print("Erro:", e)