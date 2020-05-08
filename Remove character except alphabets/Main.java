#include <bits/stdc++.h> 
#include<iostream>
#include<string.h>
using namespace std; 
int main() 
{ 
  char str[200];
  gets(str);
    for (int i = 0; i < strlen(str); i++)
    { 
        if (str[i] < 'A' || str[i] > 'Z' && 
            str[i] < 'a' || str[i] > 'z')  
        {    
          //
        } 
       else
           std::cout << str[i]; 
    } 
  
} 