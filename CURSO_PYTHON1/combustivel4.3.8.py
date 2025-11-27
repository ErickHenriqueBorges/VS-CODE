def LitrosParaMilhas(litros):
    kmPorLitro=100/litros
    milhaslitro=kmPorLitro/1.609344
    milhasgalao = milhaslitro*3.785411784
    return milhasgalao
def galaoparamilhas(mpg):
    milhasporlitro=mpg/3.785411784
    kmporlitro=milhasporlitro*1.609344
    litrospor100km=100/kmporlitro
    return litrospor100km
print(LitrosParaMilhas(3.9))
print(LitrosParaMilhas(7.5))
print(LitrosParaMilhas(10.))
print(galaoparamilhas(60.3))
print(galaoparamilhas(31.4))
print(galaoparamilhas(23.5))