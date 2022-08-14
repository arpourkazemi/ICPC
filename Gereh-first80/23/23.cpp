#include<bits/stdc++.h>

using namespace std;

int main(){
    string s;
    int g = 0,r = 0,y = 0;
    cin >> s;
    for (int i = 0; i < 5; i++)
    {
        switch (s[i])
        {
        case 'G':
            g++;
            break;
        case 'R':
            r++;
            break;
        case 'Y':
            y++;
            break;
        }
    }
    bool canEat = true;
    if ( r >= 3) canEat = false;
    if ( r >= 2 && y >= 2) canEat = false;
    if ( g == 0) canEat = false;
    if (canEat) cout << "rahat baash";
    else cout << "nakhor lite";
}