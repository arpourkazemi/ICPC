#include <bits/stdc++.h>
#include <string>
using namespace std;

int main() {
    string num;
    cin >> num;
    for (int i = 0; i < num.length(); i++)
    {
        int x = stoi(num.substr(i, 1));
        // int x = 5;
        cout << x << ": ";
        for (int i = 0; i < x; i++)
        {
            cout << x;
        }
        cout << "\n";
    }
}