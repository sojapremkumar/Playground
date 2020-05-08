#include<iostream>
using namespace std;
int main()
{
int r,c,n,a;
  cin>>r>>c>>n;
  a=2*r;
  int b=r*(c-1);
  c=(b-r);
  if((n>r&&n<=a)||(n>c&&n<=b))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}