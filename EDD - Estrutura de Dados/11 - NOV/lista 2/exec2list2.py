
inventario = {
    "Espada": 1,
    "Poção de Vida": 5,
    "Flecha": 20,
    "Escudo": 1
}

def exibir_inventario():
    print("\n=== Inventário ===")
    if not inventario:
        print("O inventário está vazio!")
    else:
        for item, quantidade in inventario.items():
            print(f"{item}: {quantidade}")
    print("==================")

def adicionar_item():
    item = input("\nDigite o nome do novo item: ")
    if item in inventario:
        print("O item já existe no inventário. Use a opção de atualizar quantidade.")
    else:
        try:
            quantidade = int(input(f"Digite a quantidade inicial de '{item}': "))
            if quantidade > 0:
                inventario[item] = quantidade
                print(f"Item '{item}' adicionado ao inventário com {quantidade} unidade(s)!")
            else:
                print("A quantidade deve ser maior que zero.")
        except ValueError:
            print("Quantidade inválida. Deve ser um número inteiro.")


def atualizar_quantidade():
    item = input("\nDigite o nome do item a ser atualizado: ")
    if item in inventario:
        try:
            quantidade = int(input(f"Digite a nova quantidade de '{item}': "))
            if quantidade >= 0:
                inventario[item] = quantidade
                print(f"Quantidade de '{item}' atualizada para {quantidade} unidade(s)!")
            else:
                print("A quantidade não pode ser negativa.")
        except ValueError:
            print("Quantidade inválida. Deve ser um número inteiro.")
    else:
        print("Item não encontrado no inventário.")

def remover_item():
    item = input("\nDigite o nome do item a ser removido: ")
    if item in inventario:
        del inventario[item]
        print(f"Item '{item}' removido do inventário!")
    else:
        print("Item não encontrado no inventário.")

def menu():
    while True:
        print("\n=== Sistema de Inventário ===")
        print("1. Exibir inventário")
        print("2. Adicionar novo item")
        print("3. Atualizar quantidade de um item")
        print("4. Remover item esgotado")
        print("5. Sair")
        print("==============================")
        opcao = input("Escolha uma opção: ")

        if opcao == "1":
            exibir_inventario()
        elif opcao == "2":
            adicionar_item()
        elif opcao == "3":
            atualizar_quantidade()
        elif opcao == "4":
            remover_item()
        elif opcao == "5":
            print("\nSaindo do sistema de inventário. Até a próxima!")
            break
        else:
            print("Opção inválida! Tente novamente.")

# Executa o programa
menu()
