#include<bits/stdc++.h>
using namespace std;

//F= (9/5)*C + 32
double celciusToFranhite(int temp){


	return (1.8*temp) + 32;
}




int main(){

	#ifndef ONLINE_JUDGE
 
    // For getting input from input.txt file
    freopen("input.txt", "r", stdin);
 
    // Printing the Output to output.txt file
    freopen("output.txt", "w", stdout);
 
	#endif

	int temp;

	cin >> temp;


	cout<<celciusToFranhite(temp);

	return 0;

}