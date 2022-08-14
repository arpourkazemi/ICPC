#include <bits/stdc++.h>
using namespace std;

bool isOneDigit(long);
long addDigits(long);


int main() {
    long x;
    cin >> x;
    while (!isOneDigit(x)){
        x = addDigits(x);
    }
    cout << x;
}

long addDigits(long x){
    long y = 0;
    while (x > 0)
    {
        y += (x%10);
        x /= 10;
    }
    return y;
}

bool isOneDigit(long x){
    if(x >= 10) return false;
    return true;
}