#include<bits/stdc++.h>
using namespace std;

int main() {
    int n, max = 0, p;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> p;
        if(p > max) max = p;
    }
    cout << max;
}