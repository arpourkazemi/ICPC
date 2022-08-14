#include <bits/stdc++.h>
#include <math.h>
using namespace std;

void display(int a[]) {
   for(int i = 0; i < 3; ++i)
   cout << a[i] << " ";
}

int main() {
    int x[3];
    cin >> x[0] >> x[1] >> x[2];
    sort(x, x+3);
    if ( pow(x[2],2) == pow(x[0],2) + pow(x[1],2)) cout << "YES";
    else cout << "NO";
}