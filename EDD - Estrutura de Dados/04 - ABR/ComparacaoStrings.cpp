#include <iostream>
#include <string.h>

main(){
    char nome1[1000], nome2[1000];
    std::cout << "Informe 2 nomes: \n";
    fflush(stdin);
    gets(nome1);
    fflush(stdin);
    gets(nome2);
    int ret;
    ret = stricmp (nome1, nome2);
    if(ret==0){
        std::cout<<nome1<<"e igual"<<nome2<<std::endl;
    }
    if(ret>0){
        std::cout<<nome1<<"e maior"<<nome2<<std::endl;
    }
    if(ret<0){
        std::cout<<nome1<<"e menor"<<nome2<<std::endl;
    }
    system("pause");
}