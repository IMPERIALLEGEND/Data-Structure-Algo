#include<bits/stdc++.h>
using namespace std;


int computing_power(int a, int b){

    int ans = 1;
    for(int i = 1; i<=b; i++){

        ans = ans * a;
    }
    
    cout<<ans<<" ";
}

/*
power(x, n) = power(x, n / 2) * power(x, n / 2);        // if n is even 2 ^ 8 = 2 ^ 4 * 2 ^ 4
power(x, n) = x * power(x, n / 2) * power(x, n / 2);    // if n is odd  2 ^ 7 = 2 ^ 1 * 2 ^ 3 * 2 ^ 3
*/
int eff_computing_power(int a, int b){

    if( b == 0 ){
        return 1;
    }

    int temp = eff_computing_power(a, b/2);


    if( b % 2 == 0){

        return temp * temp;
    }

    else{

        return a * temp * temp;
    }


}




int main(){

	#ifndef ONLINE_JUDGE
 
    // For getting input from input.txt file
    freopen("input.txt", "r", stdin);
 
    // Printing the Output to output.txt file
    freopen("output.txt", "w", stdout);
 
	#endif

    int a = 0;
    int b = 0;

    cin >> a >> b;

    computing_power(a,b);
    cout << eff_computing_power(a,b);


	return 0;

}