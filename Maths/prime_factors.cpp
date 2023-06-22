#include <bits/stdc++.h>
using namespace std;

int prime_factor(int num)
{

    if (num <= 1)
        return false;

    if (num % 2 == 0)
    {

        while (num % 2 == 0)
        {
            cout << 2 << " ";
            num = num / 2;
        }
    }

    if (num % 3 == 0)
    {

        while (num % 3 == 0)
        {
            cout << 3 << " ";
            num = num / 3;
        }
    }

    for (int i = 5; i * i <= num; i = i + 6)
    {

        while (num % i == 0)
        {

            cout << i << " ";
            num = num / i;
        }

        while (num % (i + 2) == 0)
        {

            cout << i + 2 << " ";
            num = num / (i + 2);
        }
    }

    if (num > 3)
    {
        cout << num << " ";
    }

    return 0;
}

int main()
{

#ifndef ONLINE_JUDGE

    // For getting input from input.txt file
    freopen("input.txt", "r", stdin);

    // Printing the Output to output.txt file
    freopen("output.txt", "w", stdout);

#endif

    int num = 0;

    cin >> num;

    prime_factor(num);

    return 0;
}