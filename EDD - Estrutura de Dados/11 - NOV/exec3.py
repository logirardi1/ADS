
def main():
    # melhores candidatos que a humanidade pode formar
    candidates = {
        "Yussef Stalin": 0,
        "Che Guevara": 0,
        "Margaret Thatcher": 0,
        "Dr. Eneas Carneiro": 0,
        "Ciro Gomes": 0
    }

    while True:
        print("\nMenu:")
        print("1. Votar em um candidato")
        print("2. Exibir resultados da votação")
        print("3. Sair")
        choice = input("Escolha uma opção: ")

        if choice == "1":
            print("\nCandidatos disponíveis para votar:")
            for candidate in candidates:
                print(f"- {candidate}")
            
            vote = input("\nDigite o nome do candidato em quem deseja votar: ").strip()
            if vote in candidates:
                candidates[vote] += 1
                print(f"Voto computado para {vote}.")
            else:
                print("Candidato não encontrado. Tente novamente.")
        
        elif choice == "2":
            print("\nResultados da votação:")
            for candidate, votes in candidates.items():
                print(f"{candidate}: {votes} votos")
        
        elif choice == "3":
            print("Encerrando o programa.")
            break
        
        else:
            print("Opção inválida. Tente novamente.")

if __name__ == "__main__":
    main()
