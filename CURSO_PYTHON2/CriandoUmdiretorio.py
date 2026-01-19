import os 

nomedodiretorio=input("Informe o nome do diretorio que deseja criar\n")

if not os.path.exists(nomedodiretorio): ## faz a verificaçao se o diretorio existe, se existir retorna True, e se nao existir retorna False 
    os.mkdir(nomedodiretorio)## Funçao que cria o diretorio
    print(f"O diretorio {nomedodiretorio} foi criado com sucesso")
else:
    print(f"O diretorio {nomedodiretorio} ja existe")
