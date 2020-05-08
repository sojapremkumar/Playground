#include<iostream>
using namespace std;
int main()
{
 int pamt,rate,year;
  std::cin>>pamt;
  std::cin>>rate;
  std::cin>>year;
  float interest=(pamt*rate*year)/100;
  float tamt=pamt+interest;
  float damt=(interest*2)/100;
  float famt=(pamt+interest)-damt;
  std::cout<<interest<<"\n";
  std::cout<<tamt<<"\n";
  std::cout<<damt<<"\n";
  std::cout<<famt<<"\n";
}