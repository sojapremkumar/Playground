#include<iostream>
int main()
{
  int a=121,n,b=104;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  { std::cout<<a<<" ";
  a=a+b;
   b=b+32;
   }
}
 