#include<bits/stdc++.h>
using namespace std;


int all_factors(int num){

    int i=1;

    for(i=1; i * i <num ;i++){

        if(num % i == 0){

            cout << i << " ";
        }

    }

    for(;i >= 1; i--){

        if(num % i == 0){

            cout << num / i<< " ";

        }
    }
}




int main(){

	#ifndef ONLINE_JUDGE
 
    // For getting input from input.txt file
    freopen("input.txt", "r", stdin);
 
    // Printing the Output to output.txt file
    freopen("output.txt", "w", stdout);
 
	#endif

    int num =0;
    cin>>num;
    cout<<all_factors(num);
	return 0;

}