#include<bits/stdc++.h>
using namespace std;



int factorial(int num){




	if(num == 0 || num == 1){

		return 1;

	}



	return num * factorial(num - 1);
}


/*
5 * 4
	
	4 * 3

		3 * 2

			2 * 1

				1


*/
int main(){


	int num = 0;

	cin >> num;


	cout << factorial(num);


	return 0;

}