#include<bits/stdc++.h>
using namespace std;


int count_set_bit(int n){

    int ans = 0;

    while(n > 0){
        if(n % 2 != 0){
            ans++;
        }

        n = n / 2;
        
    }

    cout << ans ;

    return 0;
}




int main(){

	#ifndef ONLINE_JUDGE
 
    // For getting input from input.txt file
    freopen("input.txt", "r", stdin);
 
    // Printing the Output to output.txt file
    freopen("output.txt", "w", stdout);
 
	#endif

    int n = 0;

    cin >> n;

    count_set_bit(n);


	return 0;

}