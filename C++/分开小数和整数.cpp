#include <iostream>
using namespace std;

double splitFloat (double x){
	
	int a;
	double b;
	a=int (x);
	b=x-a;
	cout<<"Interget part="<<a<<endl;
	cout<<"Fraction part="<<b<<endl;
}

int main(){
	
    double x;
	cout<<"输入一个数："<<endl;
	cin>>x;
	cout<<splitFloat(x); 
	
	return 0;
}
