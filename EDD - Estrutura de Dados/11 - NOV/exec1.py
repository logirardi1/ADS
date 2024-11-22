def is_valid_sequence(rolls):
   
    for i in range(len(rolls) - 2):
        # Verifica se três valores consecutivos são iguais
        if rolls[i] == rolls[i + 1] == rolls[i + 2]:
            return False
    return True

def main():
  
    try:
        # Solicita ao usuário para inserir os lançamentos
        user_input = input("Digite os lançamentos do dado (separe-os por virgula ou espaco) (valores entre 1 e 6): ")
        
        # Processa a entrada para aceitar valores separados por vírgulas ou espaços
        rolls = [int(x) for x in user_input.replace(',', ' ').split() if x.isdigit()]

        # Verifica se todos os valores estão no intervalo válido (1 a 6)
        if not all(1 <= roll <= 6 for roll in rolls):
            print("Todos os valores devem estar no intervalo de 1 a 6.")
            return
        
        # Verifica se a sequência é válida
        if is_valid_sequence(rolls):
            print("A sequência de lançamentos é válida!")
        else:
            print("A sequência de lançamentos NÃO é válida.")
    
    except ValueError:
        print("Por favor, insira uma sequência válida de números.")

if __name__ == "__main__":
    main()
