#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) cout << "*";
    cout << "\n";
    for (int i = 0; i < n-2; i++)
    {
        cout << "*";
        for (int i = 0; i < n-2; i++)
        {
            cout << " ";
        }
        cout << "*\n";        
    }    
    for (int i = 0; i < n; i++) cout << "*";
}