#include<bits/stdc++.h>
using namespace std;

string reverse(string);

int main() {
    string firstNum, secondNum;
    cin >> firstNum >> secondNum;
    int first, second;
    bool firstIsSmaller = false;
    first = stoi(reverse(firstNum));
    second = stoi(reverse(secondNum));
    if (first > second) firstIsSmaller = false;
    else firstIsSmaller = true;
    if (first == second){
        cout << firstNum << " = " << secondNum;
    }else if (firstIsSmaller){
        cout << firstNum << " < " << secondNum;
    }else{
        cout << secondNum << " < " << firstNum;
    }
    return 0;
}


string reverse(string input){
    string result = "";
    for (int i = input.length()-1; i >= 0; i--)
    {
        result += input.substr(i,1);
    }
    return result;
}