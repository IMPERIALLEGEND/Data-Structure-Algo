#include<bits/stdc++.h>
using namespace std;


int right_most_bit_diff(int m, int n){

    int res = m ^ n;

    int count = 1;

    // while(res){
    //     if(res & 1 != 0){

    //         cout << count << endl;
    //         return 0;
            

    //     }
    //     res = res >> 1;
    //     count++;

    // }

    cout << log2(res & -res) + 1;
    

    return 0;
}




int main(){

	#ifndef ONLINE_JUDGE
 
    // For getting input from input.txt file
    freopen("input.txt", "r", stdin);
 
    // Printing the Output to output.txt file
    freopen("output.txt", "w", stdout);
 
	#endif

    int m = 0;

    cin >> m;

    int n = 0;

    cin >> n;

    right_most_bit_diff(m,n);


	return 0;

}