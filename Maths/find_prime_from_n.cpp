#include<bits/stdc++.h>
using namespace std;


int find_prime(int n){

    bool a[n+1];
    memset(a,true,sizeof(a));

    for(int i = 2; i * i <= n; i++){

        if(a[i] == true){

            for(int p = i*i; p <= n; p=p+i){
                a[p] = false;
                
            }
        }
    }

    for(int i=2;i<=n;i++){

        if(a[i] == true){
            cout<<i<<" ";
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

    int num = 0;

    cin>>num;

    find_prime(num);


	return 0;

}