#include <iostream>
#include <stdlib.h>

class Pilha {
    private: int topo, tam_max;
        char * itens;
public: Pilha(int n){
    tam_max=n;
    itens= new chat[n];
    topo=0;
}
bool empty(){
    return(topo==0);
}
bool full(){
    return (topo==tam_max);
}
int size(){
    return topo;
}
void push (charchave){
    if(full()){
        std::cout << "Pilha Cheia\n";
        return;
    }
void pop(){
    if(empty()){
        std::cout << "Pilha vazia\n"
        return;
    }
    topo--;
}
char top(){
    return itens[topo-1];
}
}
};

main(){

    	Pilha p(1000);
    	cout<<"Informe caracteres para adcionar na pilha:";
    	char valor[100];
        //gets faz a mesma coisa q "cin" mas suporta space (ou seja é melhor)
    	gets(valor);
    	for(int i=0; valor[i] !='\0'; i++){
    		p.push(valor[i]);

		}
		cout<<" \n despilhando caracteres: \n";
		while(! p.empty()){
			cout<<p.top();
			p.pop();

		}
		cout<<endl;
	}
