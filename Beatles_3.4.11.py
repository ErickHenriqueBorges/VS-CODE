beatles=[]
beatles.append("John Lennon")
beatles.append("Paul McCartney")
beatles.append("George Harrison")
print(beatles)
for i in range(3):
    novo=input("Adicione os integrates faltantes\n")
    beatles.append(novo)
print(beatles)
del beatles[5]
del beatles[4]
beatles.insert(0,"Ringo Starr")
print(beatles)