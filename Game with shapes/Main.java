#include<iostream>
using namespace std;
int main()
{
  int r,l;
  std::cin>>r;
  std::cin>>l;
  int d=2*r;
  if(d==l)
  {
    std::cout<<"circle can be inside a square";
  }
  else
  std::cout<<"circle cannot be inside a square";
}