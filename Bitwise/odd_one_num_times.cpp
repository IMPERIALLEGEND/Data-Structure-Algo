#include<bits/stdc++.h>
using namespace std;


int best_odd_num_times(int a[], int n){

    int res = a[0];

    for(int i=1;i<n;i++){

        res = res ^ a[i];
    }

    cout << "Best Case O(N) Ans "<< res<<endl;
    

   /*

   Logic 

    Here ^ is the XOR operators;
    Note :
    x^0 = x
    x^y=y^x (Commutative property holds)
    (x^y)^z = x^(y^z) (Distributive property holds)
    x^x=0

    if x is odd x ^ x ^ x = x
    if x is even x ^ x ^ x ^ x = 0
    
   */



    return 0;
}



int worst_odd_num_times(int a[], int n){

    for(int i=0;i<n;i++){

        int count=0;
        for(int j=0;j<n;j++){

            if(a[i] == a[j]){
                count++;
            }
        }

        if(count % 2 != 0){

            cout << "Worst Case Ans (N^2) "<<a[i]<<endl;
            return 0; 
        }
    }


    return 0;
}



int main(){

	#ifndef ONLINE_JUDGE
 
    // For getting input from input.txt file
    freopen("input.txt", "r", stdin);
 
    // Printing the Output to output.txt file
    freopen("output.txt", "w", stdout);

    int n = 0;
    cin >> n;

    int a[n];

    for(int i=0;i<n;i++){

        cin >> a[i];
    }

    worst_odd_num_times(a,n);
    best_odd_num_times(a,n);
 
	#endif


	return 0;

}