#include <iostream>
using namespace std;
int main(){
    //? array de 10 posicoes
    int Vetor[10];
    int Contador, QuantItems = 0;

    cout << "Insira os valores do Vetor[]" << endl;
    for(Contador = 0; Contador < 10; Contador++){
        cin >> Vetor[Contador];
        //? incremento da variável
        QuantItems++;
    }

    //? Imprime os itens do array
    cout << "\nValores.: ";
    for(Contador = 0; Contador < 10; Contador++) cout << Vetor[Contador] << ", ";

    //? declaramos uma variavel e pedimos para o usuario digitar um valor que em seguidda armazenamos na mesma variavel
    int ValorBusca;
    cout << "\n\nPesquisar numero.: ";
    cin >> ValorBusca;

    //? Esse for percorre o array procurando o valor que o usuario digitou
    for(Contador = 0; Contador < QuantItems; Contador++){
        //? Quando o valor e encontrado ele para o loop e exibe a posicao e o valor
        if(ValorBusca == Vetor[Contador]){
            cout << "\nPosicao: " << Contador << "\nValor: " << Vetor[Contador];
            break;
        }
    }
    cout << "\n";
    //? Se o valor nao foi encontrado ele exibe uma mensagem
    if(Contador == QuantItems) cout << "\nValor nao Encontrado";

    //? Aqui fazemos o mesmo que na parte superior, declaramos e guardamos a variavel com o valor dado pelo usuario
    int ValorDeletar;
    cout << "\nInsira o valor a ser Excluido: ";
    cin >> ValorDeletar;

    //? Esse for percorre o array procurando o valor que o usuario digitou
    for(Contador = 0; Contador < QuantItems; Contador++){
        //? Quando o valor � encontrado ele realiza as acoes dentro dele
        if(Vetor[Contador] == ValorDeletar){
            //? Se o valor for diferente da ultima posicao do array ele faz a movimentação
            if (Contador != QuantItems - 1){
                //? Esse for faz a movimentacao dos valores
                for (int ContadorLista = Contador ; ContadorLista < (QuantItems - 1); ContadorLista++){
                    Vetor[ContadorLista] = Vetor[ContadorLista + 1];        
                }
            }
            //? "deleta" o valor da posicao
            QuantItems = QuantItems - 1;
            //? exibe o valor removido
            cout << "\nValor removido da posicao: " << Contador << endl;
            //? para o loop
            break;
        }
    }
    //? Se o valor nao foi encontrado ele exibe uma mensagem
    if(Contador == QuantItems) cout << "\nValor nao encontrado";
    //? Imprime os itens do array
    for (Contador = 0; Contador < QuantItems; Contador++) cout << " " << Vetor[Contador];

    return 0;
}

/*

codigo completo sme comentarios:

#include <iostream>
using namespace std;
int main(){
    int Vetor[10];
    int Contador, QuantItems = 0;

    cout << "Insira os valores do Vetor[]" << endl;
    for(Contador = 0; Contador < 10; Contador++){
        cin >> Vetor[Contador];
        QuantItems++;
    }

    cout << "\nValores.: ";
    for(Contador = 0; Contador < 10; Contador++) cout << Vetor[Contador] << ", ";

    int ValorBusca;
    cout << "\n\nPesquisar numero.: ";
    cin >> ValorBusca;

    for(Contador = 0; Contador < QuantItems; Contador++){
        if(ValorBusca == Vetor[Contador]){
            cout << "\nPosicao: " << Contador << "\nValor: " << Vetor[Contador];
            break;
        }
    }
    cout << "\n";
    if(Contador == QuantItems) cout << "\nValor nao Encontrado";

    int ValorDeletar;
    cout << "\nInsira o valor a ser Excluido: ";
    cin >> ValorDeletar;

    for(Contador = 0; Contador < QuantItems; Contador++){
        if(Vetor[Contador] == ValorDeletar){
            if (Contador != QuantItems - 1){
                for (int ContadorLista = Contador ; ContadorLista < (QuantItems - 1); ContadorLista++){
                    Vetor[ContadorLista] = Vetor[ContadorLista + 1];        
                }
            }
            QuantItems = QuantItems - 1;
            cout << "\nValor removido da posicao: " << Contador << endl;
            break;
        }
    }
    if(Contador == QuantItems) cout << "\nValor nao encontrado";
    for (Contador = 0; Contador < QuantItems; Contador++) cout << " " << Vetor[Contador];

    return 0;
}

*/
