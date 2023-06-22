#include<bits/stdc++.h>
using namespace std;

// (-b ± √ (b2 - 4ac) )/2a
 vector<int> quadraticRoots(int a, int b, int c) {

        int d=(b*b)-(4*a*c);

        vector<int>v;

        if(d<0)

        {

         v.push_back(-1);

         return v;

        }

        double k=sqrt(d);

        double r1,r2;

 

           r1 = floor((-b + k)/(2*a));

           r2 = floor((-b - k)/(2*a));

       

      v.push_back(max(r1,r2));

      v.push_back(min(r1,r2));
      
      return v;

}




int main(){


	int a,b,c;
	cin>>a>>b>>c;

	vector<int>res = quadraticRoots(a,b,c);

	cout<< res[0] <<" "<< res[1];
	return 0;

}