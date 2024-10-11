import random

n = 900 
soma_idade = 0
quantidade_mulheres = 0
quantidade_homens_entre_18_e_40 = 0

# input do usuario (simulado com valores aleatórios)
for i in range(n):
    #alternate randoms
    sexo = random.choice(['M', 'F'])
    idade = random.randint(1, 100)
    
    soma_idade += idade
    
    # muié
    if sexo == 'F':
        quantidade_mulheres += 1
    # homi
    if sexo == 'M' and 18 <= idade <= 40:
        quantidade_homens_entre_18_e_40 += 1

# calc média da idade
media_idade = soma_idade / n

print(f"Média da idade dos habitantes: {media_idade:.2f}")
print(f"Quantidade de mulheres: {quantidade_mulheres}")
print(f"Quantidade de homens entre 18 e 40 anos: {quantidade_homens_entre_18_e_40}")
