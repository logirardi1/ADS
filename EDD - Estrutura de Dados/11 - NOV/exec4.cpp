#include <iostream>
#include <queue>
#include <vector>

using namespace std;

void read_priority_queue(priority_queue<int>& pq, int count) {
    int value;
    cout << "Digite os " << count << " valores para a fila de prioridade: ";
    for (int i = 0; i < count; ++i) {
        cin >> value;
        pq.push(value);
    }
}

void print_and_empty_queue(priority_queue<int>& pq) {
    cout << "Conteúdo da fila combinada em ordem de prioridade: ";
    while (!pq.empty()) {
        cout << pq.top() << " ";
        pq.pop();
    }
    cout << endl;
}

int main() {
    // prioridade
    priority_queue<int> pq1, pq2, combined_pq;

    int n1, n2;
    cout << "Quantos elementos terá a primeira fila? ";
    cin >> n1;
    read_priority_queue(pq1, n1);

    cout << "Quantos elementos terá a segunda fila? ";
    cin >> n2;
    read_priority_queue(pq2, n2);

    // mergins as FILAS
    while (!pq1.empty()) {
        combined_pq.push(pq1.top());
        pq1.pop();
    }

    while (!pq2.empty()) {
        combined_pq.push(pq2.top());
        pq2.pop();
    }

    // Imprimindo e esvaziando a terceira fila
    print_and_empty_queue(combined_pq);

    return 0;
}
