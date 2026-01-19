import os 

class pesquisando:
    def busca(self, localdepesquisa, arquivoprocurado):
        try:
            os.chdir(localdepesquisa) ## abir diretorio que vai ser feito a pesquisa
        except OSError:
            return
        caminhoatual = os.getcwd()
        for acesso in os.listdir("."):
            if acesso == arquivoprocurado:
                print( os.getcwd() + "/" + arquivoprocurado)
            else:
                self.busca(caminhoatual + "/" + acesso,arquivoprocurado)
        caminhoatual= os.getcwd()
localdepesquisa= input(" informe o local de deseja procura o aquivo")
arquivoprocurado=input(" informe qual arquivo que deseja encontrar")
chamandoclass= pesquisando()
chamandoclass.busca(localdepesquisa,arquivoprocurado)
         