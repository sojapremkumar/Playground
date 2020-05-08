#include<iostream>
#include<string.h>
#include<cstring>
using namespace std;
int main ()
{
    char str[50],str2[50],temp;
    int i, j;
    
    cin>>str2;
    cin>>str;
    j = strlen(str) - 1;
    for (i = 0; i < j; i++,j--)
    {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    if((strcmp(str,str2))==0)
    std::cout <<"It is correct";
    else
    std::cout<<"It is wrong";
    return 0;
}