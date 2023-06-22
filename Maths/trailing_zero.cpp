#include<bits/stdc++.h>
using namespace std;
/*
A trailing zero is always produced by prime factors 2 and 5.
n = 5: There is one 5 and 3 2s in prime factors of 5! (2 * 2 * 2 * 3 * 5). So a count of trailing 0s is 1.
n = 11: There are two 5s and eight 2s in prime factors of 11! (2 8 * 34 * 52 * 7). So the count of trailing 0s is 2.

We are counting the prime factorial of 5 that causes trailing zero
1 X 2 X 3 X 4 X 5 ..... X 25 X ..... X 125
trailing zero = (n/5) + (n/25) + (n/125) + ....

*/


int trailing_zero(int num){

    int res=0;

    for(int i = 5; i <= num; i=i*5){

        res = res + (num/i);
    }

    return res;
}



int main(){

	#ifndef ONLINE_JUDGE
 
    // For getting input from input.txt file
    freopen("input.txt", "r", stdin);
 
    // Printing the Output to output.txt file
    freopen("output.txt", "w", stdout);
 
	#endif

    int num = 0;

    cin >> num;

    cout << trailing_zero(num);


	return 0;

}