#include<bits/stdc++.h>
using namespace std;

int countOfDigit(int digit){

	int ans = 0;

	while(digit > 0){

		digit = digit / 10;
		ans++;
	};

	return ans;

};

int main(){

	int digit = 0;
	cin>> digit;

	cout<<countOfDigit(digit);

	return 0;
}