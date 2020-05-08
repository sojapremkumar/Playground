#include<iostream>
using namespace std;
int main()
{
float m;
  int p,d;
  std::cin>>m;
  std::cin>>p;
  std::cin>>d;
  int v=m*p;
  if(v>d)
  {
  std::cout<<"Can reach";
  }
  else
    std::cout<<"Cannot reach";
}