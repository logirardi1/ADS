from queue import Queue

fila_maiusculas = Queue()
fila_minusculas = Queue()

entrada = input("Digite os caracteres (ENTER para finalizar): ")

for char in entrada:
    if char.isupper():  
        fila_maiusculas.put(char)
    elif char.islower():  
        fila_minusculas.put(char)

print("\nConteúdo da Fila 1 (Letras Maiúsculas):")
while not fila_maiusculas.empty():
    print(fila_maiusculas.get(), end=" ")

print("\n\nConteúdo da Fila 2 (Letras Minúsculas):")
while not fila_minusculas.empty():
    print(fila_minusculas.get(), end=" ")

print()
