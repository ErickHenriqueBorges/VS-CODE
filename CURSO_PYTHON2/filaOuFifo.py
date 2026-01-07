class QueueError(Exception):  
    pass

class Queue:
    def __init__(objeto):
        objeto.__fila = []  

    def put(objeto, elem):
        objeto.__fila.insert(0, elem)  

    def get(objeto):
        if len(objeto.__fila) == 0: 
            raise QueueError("Fila vazia!")
        return objeto.__fila.pop()  
que = Queue()
que.put(1)
que.put("dog")
que.put(False)

try:
    for i in range(4):  
        print(que.get())
except QueueError:### aqui vai dar falso, pq temos somente 3 elementos (1,dog,false)
    print("Erro da fila")
