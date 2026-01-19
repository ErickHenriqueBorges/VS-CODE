import os
from os import strerror 
try:
    quantidade=int(input("informe a quantidade de diretorios recursivos que deseja criar:\n"))
    diretorioprincipal=input("informe o nome do diretorio principal/Diretorio base:\n").strip()## strip e uma funçao para remover os espaços
    if  not os.path.exists(diretorioprincipal):## verificaçao de exitencia
        os.mkdir(diretorioprincipal) ## criando o diretorio 
    else:
        print(f"\n {diretorioprincipal} ja existente\n") 
    caminho_atual = diretorioprincipal
    for i in range(quantidade):
        nome_subdir = input(f"\nDigite o nome do diretório {i+1}: \n").strip() ## strip e uma funçao para remover os espaços dos nomes dos diretorios
        caminho_atual = os.path.join(caminho_atual, nome_subdir)
        os.makedirs(caminho_atual, exist_ok=True)
        print(f'Diretório "{caminho_atual}" criado!')

    print("\nTodos os diretórios foram criados com sucesso!")
except OSError as e:
    print("Erro ocorrido:", e)