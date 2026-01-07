import math

class point:
    def __init__(self, x=0, y=0):
        self.__x = x
        self.__y = y
    def getx(self):
        return self.__x
    def gety(self):
        return self.__y
    
    def dsitanciaentrexy(self, x, y):
        distanciax = self.__x - x
        distanciay = self.__y - y
        return math.sqrt(distanciax**2 + distanciay**2)
    def distanciaentreospontos(self, ponto):
        return self.dsitanciaentrexy(ponto.getx(), ponto.gety())
    
p1 = point(0, 0)
p2 = point(1, 1)

print(p1.distanciaentreospontos(p2))        
print(p2.dsitanciaentrexy(2, 0))            