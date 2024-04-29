#include <iostream>

typedef struct {
    char nome [80], dep[80];
    float sal; 
} Funcionario;
main() {
    Funcionario reg;
    std::cout << "Preencha a ficha cadastral\n";
    std::cout << "Nome: ";
    fflush(stdin);
    gets(reg.nome);
    std::cout << "Departamento: ";
    fflush(stdin);
    gets(reg.dep);
    std::cout << "Salario: ";
    std::cin >> reg.sal;
    std::cout << "\n Imprimindo Conteudo: \n";
    std::cout << "Nome: " << reg.nome << std::endl;
    std::cout << "Departamento: " << reg.dep << std::endl;
    std::cout << "Salario: " << reg.sal << std::endl;
}