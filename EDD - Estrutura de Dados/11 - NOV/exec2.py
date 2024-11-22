# wine_cellar.py

from collections import deque

class WineCellar:
    def __init__(self):
        """
        Inicializa a adega como uma fila para gerenciar os vinhos.
        """
        self.cellar = deque()

    def add_wine(self, product, casta, safra):
        
        
        self.cellar.appendleft({"Produto": product, "Casta": casta, "Safra": safra})

    def get_next_wine(self):
        
        if self.cellar:
            return self.cellar[0]  # O primeiro vinho na fila
        return None

    def print_oldest_wines(self):
        
        print("Cinco aquisições mais antigas na adega:")
        for i, wine in enumerate(list(self.cellar)[-5:][::-1], start=1):
            print(f"{i}. Produto: {wine['Produto']}, Casta: {wine['Casta']}, Safra: {wine['Safra']}")

    def open_wine(self):
        
        if self.cellar:
            return self.cellar.popleft()
        return None

def main():
    
    cellar = WineCellar()

    while True:
        print("\nMenu:")
        print("1. Adicionar novo vinho")
        print("2. Mostrar o próximo vinho a ser aberto no jantar")
        print("3. Imprimir as cinco aquisições mais antigas")
        print("4. Abrir o próximo vinho no jantar")
        print("5. Sair")
        choice = input("Escolha uma opção: ")

        if choice == "1":
            product = input("Digite o nome do produto: ")
            casta = input("Digite o tipo da casta: ")
            safra = input("Digite o ano da safra: ")

            if not safra.isdigit():
                print("Por favor, insira um ano válido para a safra.")
                continue

            cellar.add_wine(product, casta, int(safra))
            print("Vinho adicionado com sucesso!")
        
        elif choice == "2":
            next_wine = cellar.get_next_wine()
            if next_wine:
                print(f"Próximo vinho a ser aberto: Produto: {next_wine['Produto']}, Casta: {next_wine['Casta']}, Safra: {next_wine['Safra']}")
            else:
                print("A adega está vazia.")
        
        elif choice == "3":
            cellar.print_oldest_wines()
        
        elif choice == "4":
            opened_wine = cellar.open_wine()
            if opened_wine:
                print(f"Você abriu: Produto: {opened_wine['Produto']}, Casta: {opened_wine['Casta']}, Safra: {opened_wine['Safra']}")
            else:
                print("A adega está vazia.")
        
        elif choice == "5":
            print("Encerrando o programa. Saúde!")
            break
        
        else:
            print("Opção inválida. Tente novamente.")

if __name__ == "__main__":
    main()
