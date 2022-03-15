#include <bits/stdc++.h>
using namespace std;

int main() {
    int x, n;
    cin >> x >> n;
    if ( n == 0 ) cout << "20";
    else if ( n == 7 ) cout << x;
    else cout << ( x-n > 0 ? x-n : 0);
}