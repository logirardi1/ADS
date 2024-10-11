#include <iostream>
using namespace std;

// author@ Lorenzo Girardi

int main() {
    int n;
    
    // Solicita o tamanho do vetor
    cout << "Informe o tamanho do vetor: ";
    cin >> n;
    
    // Alocação dinâmica do vetor
    int* vetor = new int[n];
    
    // Leitura dos valores do vetor
    for (int i = 0; i < n; i++) {
        cout << "Posicao vetor[" << i << "]: ";
        cin >> vetor[i];
    }

    // Imprimir o conteúdo do vetor
    cout << "Conteudo do vetor:\n";
    for (int i = 0; i < n; i++) {
        cout << vetor[i] << " ";
    }
    cout << endl;

    // Contar pares e ímpares
    int pares = 0, impares = 0;
    for (int i = 0; i < n; i++) {
        if (vetor[i] % 2 == 0)
            pares++;
        else
            impares++;
    }

    cout << "Quantidade de pares: " << pares << endl;
    cout << "Quantidade de impares: " << impares << endl;

    // Libera a memória alocada
    delete[] vetor;

    cout << "Pressione qualquer tecla para continuar..." << endl;
    cin.ignore();
    cin.get();
    
    return 0;
}

