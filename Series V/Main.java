#include<iostream>
using namespace std;
int main()
{
int x,n=11;
  std::cin>>x;
  for(int i=0;i<x;i++)
  {
    int p=n*n;
    n=n+4;
    std::cout<<p<<" ";
  }
}