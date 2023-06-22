#include<bits/stdc++.h>
using namespace std;



int factorial(int num){


	int ans = 1;

	if(num == 0 || num == 1){

		return 1;

	}

	for(int i=2;i<=num;i++){

		ans = ans * i;
	}

	return ans;
}



int main(){


	int num = 0;

	cin >> num;


	cout << factorial(num);


	return 0;

}