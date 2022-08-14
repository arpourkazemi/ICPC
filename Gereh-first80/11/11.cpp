#include <bits/stdc++.h>
using namespace std;

int main() {
    int r, c;
    cin >> r >> c;
    if (c <= 10) cout << "Right " << 11 - r << " " << c;
    else cout << "Left " << 11-r << " " << 21-c;
}