#include<iostream>
using namespace std;

int main(){
  
	int x; 
	int y;
	cout<<"请输入一个十进制的数："<<endl;
	cin>>x;
	
	while(x!=0){
		y=x%2;
		cout<<y;
		x=x/2;

}
return 0;
	
}
