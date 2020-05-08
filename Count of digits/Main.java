#include<iostream>
int main()
{
int n;
  std::cin>>n;
  int count=0;
 do
  {
    n=n/10;
    count++;
  } while(n>0);
   std::cout<<count; 
}