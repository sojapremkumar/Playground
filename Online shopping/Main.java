#include<iostream>
using namespace std;
int main()
{
  float a,b,c,d,e,f,g,h,i,p,q,r;
  std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  p=a-(a*(b/100))+c;
  q=d-(d*(e/100))+f;
  r=g-(g*(h/100))+i;
  std::cout<<"In Flipkart Rs."<<p<<"\n";
  std::cout<<"In Snapdeal Rs."<<q<<"\n";
  std::cout<<"In Amazon Rs."<<r<<"\n";
  if (p<=q && p<=r)
    std::cout<<"He will prefer Flipkart\n";
  else if(q<=p && q<=r)
    std::cout<<"He will prefer Snapdeal\n";
  else if(r<=p && r<=q)
    std::cout<<"He will prefer Amazon";
}