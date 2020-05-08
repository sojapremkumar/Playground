#include<iostream>
using namespace std;
int main()
{
    char str[50];
    int i=0; int l=0;
    std::cin>>str;
    while(str[i]!='\0')
    {
        l++;
        i++;
    }
    std::cout<<"The number of letters in the name is "<<l;
    return 0;
}