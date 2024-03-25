#include <iostream>
using namespace std;

// Classe de nome "Conta"
class Conta{
    // Declaracao de atributos da classe
    private: double saldo;

    // metodo construtor
    public: Conta(){
        saldo = 0;
    }

    // metodos da classe, funcoes que podem ser chamadas a partir da classe
    public: void saldo_atual(){
        cout << "saldo atual R$" << saldo << endl; 
    }

    public: void depositar(){
        cout << "informe o valor de deposito: ";
        double valor;
        cin >> valor;
        saldo += valor;
    }

    public: void sacar(){
        cout << "informe o valor de saque: ";
        double valor;
        cin >> valor;
        if (valor > saldo){
            cout << "Saldo insuficiente" << endl;
        } else {
            saldo -= valor;
        }
    }
};

int main()
{

    // Cria uma nova instancia da classe (objeto)
    Conta Andre;
    cout << "Abrindo a conta do Andre\n";
    // Chama os metodos da classe
    Andre.depositar();
    Andre.saldo_atual();
    Andre.sacar();
    Andre.saldo_atual();

    // Cria uma nova instancia da classe (objeto)
    Conta Ana;
    cout << "Abrindo a conta da Ana\n";
    // Chama os metodos da classe
    Ana.depositar();
    Ana.saldo_atual();

    return 0;
}
