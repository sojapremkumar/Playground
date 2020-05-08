#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,n;
  std::cin>>n;
  if(n==15)
    a=n+sqrt(16);
  else
    a=n/(1-(1/sqrt(n)));
  std::cout<<a;
}