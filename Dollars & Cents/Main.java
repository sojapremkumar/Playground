#include<iostream>
using namespace std;
int main()
{
int d1,c1,d2,c2,m,tc;
  float d,td;
  std::cin>>d1>>c1>>d2>>c2;
  d1=d1+d2;
  c1=c1+c2;
  m=c1%100;
  if(m!=0)
    tc=m;
  else
    tc=c1;
  d=c1/100;
  td=d1+d;
  std::cout<<td<<"\n";
  std::cout<<tc;
}