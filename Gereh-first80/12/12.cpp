#include <bits/stdc++.h>
using namespace std;

int main() {
    int numbers[1000], number;
    cin >> number;
    int index = 1;
    while (number != 0)
    {
        index++;
        numbers[index] = number;
        cin >> number;
    }
    for(int i = index; i > 1; i--){
        cout << numbers[i] << "\n";
    }
}