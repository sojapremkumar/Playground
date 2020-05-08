#include<iostream>
int main()
{
  float b=0.5;
  int n;
  std::cin>>n;
  if(n==1)
  std::cout<<b<<" ";
  else
  { std::cout<<b<<" ";
  for(int i=1;i<n;i++)
  {b=b*3;
   std::cout<<b<<" ";
   }
  }
  }