class WeekDayError(Exception):
    pass
	
class Weeker:
    listadedias=['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
    def __init__(self, day):
      if day not in Weeker.listadedias:
         raise WeekDayError()
      self.__index=Weeker.listadedias.index(day)
    def __str__(self):
       return Weeker.listadedias[self.__index] ## retorno o dia da semana em string/carcter
    def adicionandodias(self,n):
       self.__index+=(self.__index+n)%7 ## divisao por 7 pois a semana tem sete dias
    def subtrairdais( self,n):
       self.__index=(self.__index -n)%7 
try:
    dia = Weeker('Mon')
    print(dia)           
    dia.adicionandodias(15)
    print(dia)           
    dia.subtrairdais(23)
    print(dia)           
    dia = Weeker('Monday')  ## ira dar o erro pois nao se encontra na lista de dias da semana
except WeekDayError:
    print("Sorry, I can't serve your request.")

    