class Node:
    def __init__(self, tarefa):
        self.tarefa = tarefa
        self.proximo = None

class ListaTarefas:
    def __init__(self):
        self.inicio = None


    def inserir_inicio(self, tarefa):
        novo_no = Node(tarefa)
        novo_no.proximo = self.inicio
        self.inicio = novo_no


    def inserir_fim(self, tarefa):
        novo_no = Node(tarefa)
        if self.inicio is None:
            self.inicio = novo_no
        else:
            atual = self.inicio
            while atual.proximo:
                atual = atual.proximo
            atual.proximo = novo_no


    def remover_tarefa(self, tarefa_concluida):
        if self.inicio is None:
            print("A lista está vazia!")
            return


        if self.inicio.tarefa == tarefa_concluida:
            self.inicio = self.inicio.proximo
            print(f"Tarefa '{tarefa_concluida}' concluída e removida.")
            return


        anterior = None
        atual = self.inicio
        while atual and atual.tarefa != tarefa_concluida:
            anterior = atual
            atual = atual.proximo

        if atual is None:
            print(f"Tarefa '{tarefa_concluida}' não encontrada.")
        else:
            anterior.proximo = atual.proximo
            print(f"Tarefa '{tarefa_concluida}' concluída e removida.")


    def mostrar_tarefas(self):
        if self.inicio is None:
            print("Nenhuma tarefa na lista.")
            return

        print("Lista de Tarefas (ordenada por prioridade):")
        atual = self.inicio
        while atual:
            print(f"- {atual.tarefa}")
            atual = atual.proximo



if __name__ == "__main__":
    lista_tarefas = ListaTarefas()

    while True:
        print("\nGerenciador de Tarefas:")
        print("1. Inserir tarefa com prioridade alta")
        print("2. Inserir tarefa com prioridade baixa")
        print("3. Remover tarefa concluída")
        print("4. Mostrar lista de tarefas")
        print("5. Sair")

        opcao = input("Escolha uma opção: ")

        if opcao == "1":
            tarefa = input("Digite a tarefa (prioridade alta): ")
            lista_tarefas.inserir_inicio(tarefa)
        elif opcao == "2":
            tarefa = input("Digite a tarefa (prioridade baixa): ")
            lista_tarefas.inserir_fim(tarefa)
        elif opcao == "3":
            tarefa = input("Digite a tarefa concluída: ")
            lista_tarefas.remover_tarefa(tarefa)
        elif opcao == "4":
            lista_tarefas.mostrar_tarefas()
        elif opcao == "5":
            print("Encerrando o gerenciador de tarefas.")
            break
        else:
            print("Opção inválida! Tente novamente.")
