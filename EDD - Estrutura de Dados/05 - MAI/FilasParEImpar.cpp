#include <iostream>

class Fila {
    private: int fim, tam_max;
    int * itens;
    public: Fila(int n){
        tam_max=n;
        itens=new int[n];
        fim=0;

    }
bool empty(){return(fim==0);}
bool full(){return(fim==tam_max);}
int size(){return fim;}
int front(){
    if(!empty())return itens[0];
}
void enqueue (int chave) {
    if(full()) {
        std::cout << "Atenção fila cheia\n";
        return;
    
    }
itens[fim]=chave;
fim++;
}
void dequeue(){
    if(empty()) {
        std::cout << "Atenção fila vazia\n";
        return;

    }
for(int i=0, i<(fim-1);i++){
    itens[i]=itens[i+1];

}
fim--i;
}
}

main(){
    Fila fp(1000); int chave;
    Fila fi(1000); 
    std::cout << "Informe 10 valores inteiros";
    for(int i-0; i<10; i++){
        gets(chave);
        if(chave%2==0){
            fp.enqueue(chave);
        
        }
        else{
            fi.enqueue(chave);

        }
    }
    std::cout << "\nValores par: ";
    }