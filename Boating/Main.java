#include<iostream>
using namespace std;
int main()
{
 int w,a,c;
  std::cin>>w;
  std::cin>>a;
  std::cin>>c;
  int t=(75*a)+(30*c);
  if(t<=w)
  {
    std::cout<<"Boat is stable";
  }
  else
    std::cout<<"Boat will drow";
  

}