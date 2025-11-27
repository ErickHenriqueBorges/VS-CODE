
ano= int(input("iforme o ano que deseja saber se e bissexto\n"))
def anobissexto(ano):
    if (ano%4==0 and ano%100!= 0) or (ano%400 ==0):
        return True
    else:
        return False
print(ano," e um ano bissexto:",anobissexto(ano))


