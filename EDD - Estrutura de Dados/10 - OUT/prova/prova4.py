def inverter_palavras(frase):
    
    palavras = frase.split()
    
    # p/ cada palavra, inverter usando uma pilha
    resultado = []
    for palavra in palavras:
        pilha = list(palavra)  # converte a palavra em uma lista (simulando a pilha)
        palavra_invertida = ''
        while pilha:
            palavra_invertida += pilha.pop()  # tira o último item da "pilha"
        resultado.append(palavra_invertida)
    
    # dou assemble na pilha e imprimo
    print(' '.join(resultado))
frase = input("Digite uma frase para inverter as letras das palavras: ")
inverter_palavras(frase)