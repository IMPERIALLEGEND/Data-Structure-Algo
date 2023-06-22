#include <bits/stdc++.h>
using namespace std;

/*

Formula a * b = gcd(a,b) * lcm(a*b)

therefore

    lcm(a,b) = (a*b) / gcd(a,b)

*/

int gcd(int a, int b)
{

    if (b == 0)
    {

        return a;
    }

    return gcd(b, a % b);
}

int lcm(int a, int b)
{

    return (a * b) / gcd(a, b);
}

int main()
{

#ifndef ONLINE_JUDGE

    // For getting input from input.txt file
    freopen("input.txt", "r", stdin);

    // Printing the Output to output.txt file
    freopen("output.txt", "w", stdout);

#endif
    int a = 0, b = 0;

    cin >> a;
    cin >> b;

    cout << lcm(a, b);

    return 0;
}