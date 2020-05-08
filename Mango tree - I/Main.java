#include<iostream>
using namespace std;
int main()
{
int r,c,n,a=c;
  std::cin>>r>>c>>n;
  if(n%c==1||n%c==0||n<=c)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}