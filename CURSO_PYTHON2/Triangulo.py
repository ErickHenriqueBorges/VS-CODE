import math

class Point:
    def __init__(self, x=0.0, y=0.0):
        self.__x = x
        self.__y = y

    def getx(self):
        return self.__x

    def gety(self):
        return self.__y

class Triangulo:
    def __init__(self, vertice1, vertice2, vertice3):
        self.vertice1 = vertice1
        self.vertice2 = vertice2
        self.vertice3 = vertice3

    def perimetro(self):
        # Distância entre vertice1 e vertice2
        d1 = math.sqrt((self.vertice2.getx() - self.vertice1.getx())**2 + 
                       (self.vertice2.gety() - self.vertice1.gety())**2)
        
        # Distância entre vertice2 e vertice3
        d2 = math.sqrt((self.vertice3.getx() - self.vertice2.getx())**2 + 
                       (self.vertice3.gety() - self.vertice2.gety())**2)
        
        # Distância entre vertice3 e vertice1
        d3 = math.sqrt((self.vertice1.getx() - self.vertice3.getx())**2 + 
                       (self.vertice1.gety() - self.vertice3.gety())**2)
        
        # Somando para o perímetro
        return d1 + d2 + d3