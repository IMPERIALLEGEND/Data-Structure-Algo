#include<bits/stdc++.h>
using namespace std;



int cout_digit_factorial(int num){

        
            double ans = 0;
            
            if(num == 0) return 0;
        	if(num == 1){
        
        		return 1;
        
        	}
        
        	for(int i=2;i<=num;i++){
        
        		ans = ans + log10(i);
        	}

        	
 
        	
        	return floor(ans) + 1;
        	
}



int main(){

	int num = 0;

	cin >> num;

	cout << cout_digit_factorial(num);

	return 0;

}