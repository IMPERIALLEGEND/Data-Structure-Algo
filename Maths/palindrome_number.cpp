#include<bits/stdc++.h>
using namespace std;


int palindrom_number(int x){


	int rev_num=0;

	int num = x;
	while(num>0){

		int last_digit = num % 10;

		rev_num = rev_num * 10 + last_digit;

		num = num / 10;

	}

	
	if (rev_num == x){
		return true;
	}

	return false;
}




int main(){

		#ifndef ONLINE_JUDGE
 
    // For getting input from input.txt file
    freopen("input.txt", "r", stdin);
 
    // Printing the Output to output.txt file
    freopen("output.txt", "w", stdout);
 
	#endif


	int num;
	cin>> num;

	cout << palindrom_number(num);
	return 0;

}