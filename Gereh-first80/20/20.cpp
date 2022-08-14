#include <bits/stdc++.h>
#include <array>
using namespace std;

int NameToNum(string);

int main() {
    int n, weekTime[7];
    for (int i = 0; i < 7; i++)
    {
        weekTime[i] = 0;
    }
    
    for (int i = 0; i < 3; i++)
    {
        cin >> n;
        string s;
        for (int i = 0; i < n; i++)
        {
            cin >> s;
            weekTime[NameToNum(s)]++;
        }
    }
    int ans = 0;
    for (int i = 0; i < 7; i++)
    {
        if (weekTime[i] == 0) ans++;
    }
    cout << ans;
}

int NameToNum(string s){
    if (s == "shanbe") return 0;
    if (s == "jome") return 6;
    return stoi(s.substr(0, 1));
}