#include<iostream>
int main()
{
  
  int n, i, c = 0;
    
   std::cin>>n;
    
    /*logic*/    for (i = 1; i <= n; i++)
    {
        if (n % i == 0)
        {
           c++;
        }
    }
    if (c == 2)
    std::cout<<"Eligible";
    else
      std::cout<<"Not eligible";
}