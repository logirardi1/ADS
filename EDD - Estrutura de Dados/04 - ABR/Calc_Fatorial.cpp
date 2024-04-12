#include <iostream>
using namespace std;
int fat (int n){
	if(n==0)return 1;
	return n*fat(n-1);
	
}

main(){
	int v;
	cout << "Informe o valor inteiro >0: ";
	cin >> v;
	cout << "Fatorial de "<<v<<" = "<<fat(v)<<endl;
}
