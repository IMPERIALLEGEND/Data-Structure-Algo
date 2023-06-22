#include <bits/stdc++.h>
using namespace std;

/*

Euclidean algorithm

A simple and old  approach is the Euclidean algorithm by subtraction

It is a process of repeat subtraction, carrying the result forward each time until the result is equal to any one number being subtracted.
If the answer is greater than 1, there is a GCD (besides 1). If the answer is 1,
there is no common divisor (besides 1), and so both numbers are coprime

def gcd(a, b):
  if a == b:
    return a
  if a > b:
    gcd(a – b, b)
  else:
    gcd(a, b – a)


  10 % 15 = 15

  15 % 10 = 5

*/

int gcd(int a, int b)
{

  if (b == 0)
  {

    return a;
  }

  return gcd(b, a % b);
}

/*

gcd(10,15)

    gcd(15,10%15) = gcd(15,10)

        gcd(10,15%10) = gcd(10,5)

            gcd(5,10%5) = gcd(5,5)

                gcd(5,5%5) = gcd(5,1)

                    return 5 because 5 % 1 = 0

*/

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

  cout << gcd(a, b);

  return 0;
}