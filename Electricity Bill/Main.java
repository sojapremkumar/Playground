#include<iostream>
using namespace std;
int main()
{
 int unit;
  int cost;
  std::cin>>unit;
  if(unit<=200)
     {
    cost=unit*0.50;
    std::cout<<"Rs."<<cost;
  }
  else if(unit<=400)
  {
    cost=(unit*0.65)+100;
    std::cout<<"Rs."<<cost;
  }
  else if(unit<=600)
  {
    cost=(unit*0.80)+200;
    std::cout<<"Rs."<<cost;
  }
 else
  {
    cost=(unit*1.25)+425;
   std::cout<<"Rs."<<cost;
  }
}
  