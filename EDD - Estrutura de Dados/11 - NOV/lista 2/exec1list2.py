
mao = ["Ás de Espadas", "Rei de Copas", "Rainha de Ouros", "Valete de Paus", "10 de Copas"]


def exibir_mao():
    print("\nCartas na mão:")
    for i, carta in enumerate(mao, start=1):
        print(f"{i}. {carta}")


def organizar_mao():
    mao.sort()
    print("\nCartas organizadas em ordem alfabética!")


def jogar_carta():
    exibir_mao()
    carta = input("\nDigite o nome da carta que deseja jogar: ")
    if carta in mao:
        mao.remove(carta)
        print(f"\nCarta '{carta}' jogada!")
    else:
        print("\nCarta não encontrada na mão!")


def adicionar_carta():
    nova_carta = input("\nDigite o nome da nova carta: ")
    if not mao:
        mao.append(nova_carta)
        print(f"\nCarta '{nova_carta}' adicionada à mão!")
        return

    exibir_mao()
    posicao = input("Deseja adicionar a carta antes ou depois de qual carta? (Digite o nome): ")
    if posicao in mao:
        index = mao.index(posicao)
        escolha = input("Adicionar antes (B) ou depois (D)? ").strip().upper()
        if escolha == "B":
            mao.insert(index, nova_carta)
            print(f"\nCarta '{nova_carta}' adicionada antes de '{posicao}'!")
        elif escolha == "D":
            mao.insert(index + 1, nova_carta)
            print(f"\nCarta '{nova_carta}' adicionada depois de '{posicao}'!")
        else:
            print("\nEscolha inválida! A carta não foi adicionada.")
    else:
        print("\nCarta de referência não encontrada!")

def menu():
    while True:
        print("\n===============================")
        print("   Simulação de Mão de Cartas")
        print("===============================")
        print("1. Exibir cartas na mão")
        print("2. Organizar cartas na mão")
        print("3. Jogar uma carta")
        print("4. Adicionar uma carta")
        print("5. Sair")
        print("===============================")
        opcao = input("Escolha uma opção: ")

        if opcao == "1":
            exibir_mao()
        elif opcao == "2":
            organizar_mao()
        elif opcao == "3":
            jogar_carta()
        elif opcao == "4":
            adicionar_carta()
        elif opcao == "5":
            print("\nSaindo da simulação. Até a próxima!")
            break
        else:
            print("\nOpção inválida! Tente novamente.")

menu()
