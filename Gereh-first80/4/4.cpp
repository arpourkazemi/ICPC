#include<bits/stdc++.h>

using namespace std;

int main() {
    int x;
    cin >> x;
    int ans = 1;
    while (x >1)
    {
        ans *= x;
        x--;
    }
    cout << ans;
}