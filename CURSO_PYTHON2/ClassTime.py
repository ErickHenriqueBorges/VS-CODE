def formatotime(horas,minutos,segundos):
    return f"{horas:02d}:{minutos:02d}:{segundos:02d}" ## estou retornando um string no formato de hh:mm:ss
class timer:
    def __init__(self,horas=0,minutos=0,segundos=0):
        self.__horas= horas
        self.__minutos= minutos
        self.__segundos= segundos
    def __str__( self):
        return formatotime(self.__horas,self.__minutos,self.__segundos)## estou chamando a função fora da classe para deixar o valor do self no tipo desejado(string)
    def next_segundo(self):
        self.__segundos+=1
        if self.__segundos>59:
            self.__segundos=0
            self.__minutos+=1
            if self.__minutos>59:
                self.__minutos=0
                self.__horas+=1
                if self.__horas> 23:
                    self.__horas=0
    def prev_segundo(self):
        self.__segundos-=1
        if self.__segundos<0:
            self.__segundos=59
            self.__minutos-=1
            if self.__minutos<0:
                self.__minutos=59
                self.__horas-=1
                if self.__horas<0:
                    self.__horas=23

tempo = timer(23, 59, 59)
print(tempo)
tempo.next_segundo()
print(tempo)
tempo.prev_segundo ()
print(tempo)