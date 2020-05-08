#include<iostream>
using namespace std;
int main()
{
    int n,c=0;
   std::cin>>n;
    while (n != 1) 
    { 
        std::cout<<n<<"\n"; 
        if (n & 1) 
        {
            n = 3*n + 1;
            c=c+1;
        }
        else
        {
            n = n/2; 
            c=c+1;
        }
    } 
    cout <<n<<"\n"<<c; 

}