ano= int(input("iforme o ano que deseja saber se e bissexto\n"))
mes = int(input("Informe o mês (1 a 12):\n"))
def anobissexto(ano):
    if (ano%4==0 and ano%100!= 0) or (ano%400 ==0):
        return True
    else:
        return False

def dias_no_mes(ano, mes):    
    if ano < 1 or mes < 1 or mes > 12:
        return None  # argumentos inválidos
    dias_por_mes = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    if mes == 2 and anobissexto(ano):
        return 29
    return dias_por_mes[mes - 1]
print(f"{ano} é um ano bissexto: {anobissexto(ano)}")
print(f"O mês {mes} do ano {ano} tem {dias_no_mes(ano, mes)} dias.")