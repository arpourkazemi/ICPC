#include <bits/stdc++.h>
using namespace std;

int main() {
    int a, b, l;
    cin >> a >> b >> l;
    if (l%2){
        cout << (((l/2)+1)*a) + ((l/2)*b);
    }else {
        cout << ((l/2)*a) + ((l/2)*b);
    }
}