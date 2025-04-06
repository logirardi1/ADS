
preco_etiqueta = float(input("Digite o preço de etiqueta do produto: R$ "))

# input do paganento
codigo = int(input("Digite o código da condição de pagamento (1 a 4): "))


if codigo == 1:
    valor_total = preco_etiqueta * 0.8  
elif codigo == 2:
    valor_total = preco_etiqueta * 0.9  
elif codigo == 3:
    valor_total = preco_etiqueta  
elif codigo == 4:
    valor_total = preco_etiqueta * 1.05  
else:
    print("Código inválido!")
    exit()

# Saída do valor total
print(f"Valor total a pagar: R$ {valor_total:.2f}")
