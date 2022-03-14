#include <bits/stdc++.h>
using namespace std;

int main(){
    int x, y, z;
    cin >> x >> y >> z;
    if (x>0 && y>0 && z>0 && x+y+z==180) cout << "Yes";
    else cout << "No";
}