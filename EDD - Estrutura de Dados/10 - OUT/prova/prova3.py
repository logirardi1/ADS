# calc média alunos
#def calcular_media_alunos(arquivo):
#    with open(arquivo, 'r') as f:
#        linhas = f.readlines()
#    
#    for linha in linhas:
#        dados = linha.strip().split()
#        nome = dados[0]
#        notas = list(map(float, dados[1:]))
#        media = sum(notas) / len(notas)
#        print(f"{nome}: {media:.2f}")
#
#calcular_media_alunos("notas_alunos.txt")

def calcular_media_alunos(arquivo):
    try:
        with open(arquivo, 'r') as arquivo:
            for linha in arquivo:
                dados = linha.split()  # ivide a linha
                nome = dados[0]  # nome do aluno
                notas = list(map(float, dados[1:]))  # o resto é convertida para float
                media = sum(notas) / len(notas)  
                print(f'Aluno: {nome}, Média: {media:.2f}')
                  
    except FileNotFoundError:
        print("O arquivo não foi encontrado.")

    except Exception as e:
        print(f"Ocorreu um erro: {e}")

calcular_media_alunos('prova3aux.txt')

