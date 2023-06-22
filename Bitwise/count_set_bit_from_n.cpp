#include<bits/stdc++.h>
using namespace std;


int count_set_bit_from_n_simple(int n){

    int ans = 0;

    for(int i=1; i<= n; i++){

        int temp = i;
        while(temp){

            temp = temp & (temp-1);
            ans++;
            
            
        }

    }

    cout << ans<< " Worst Solution NLog(n)"<<endl;

    return ans;

    
}

int count_set_bit_best(int n){

    int ans = 0;

    vector<int> num(n+1);

    num[0] = 0;

    for(int i=1;i <= n ;i++){

        num[i] = i & 1 + num[i/2];
        ans += num[i];

    }

    cout << ans<<" Best Solution N"<<endl;


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

    count_set_bit_from_n_simple(n);
    count_set_bit_best(n);


	return 0;

}