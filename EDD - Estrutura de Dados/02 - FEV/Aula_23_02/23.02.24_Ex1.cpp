
//? Inclui a biblioteca que permite a entrada e saida de dados
//? Inclui a biblioteca que permite a funcao system('pause');
#include <iostream>
#include <stdlib.h>

//? Declara que o programa o namespace padrao (std = standard = padrao), o que inclui usar os recursos de entrada e saida
using namespace std;

//? funcao principal
int main()
{
    //? Declara as variaveis do tipo "float"
    float n1, n2;

    //? 'cout' significa 'C output' (saida)
    //? o '<<' e um forma de concatenar os dados
    cout << "informe 2 numeros reais: \n";

    //? 'cin' significa 'C input' (entrada de dados)
    cin >> n1 >> n2;

    cout << "media " << (n1+n2)/2 << endl;

    //? 'system("pause")' pausa o programa para que o usuario possa visualizar o resultado 
    system("pause");
}

/*

*codigo completo sem comentarios:

#include <iostream>
#include <stdlib.h>
using namespace std;

int main()
{
    float n1, n2;
    cout << "informe 2 numeros reais: \n";
    cin >> n1 >> n2;
    cout << "media " << (n1+n2)/2 << endl;
    system("pause");
}

*/
