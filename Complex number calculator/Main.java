#include<iostream>
using namespace std;
struct complex
{
float real;
float img;
}c1,c2;
int main()
{
int ch;
std::cin>>ch;
  float a,b;
cin>>c1.real>>c1.img;
cin>>c2.real>>c2.img;
switch(ch)
{
case 1:
    a=(c1.real)+(c2.real);
b=(c1.img)+(c2.img);
 std::cout<<a<<"+"<<b<<"i";
    break;
  case 2:
     a=(c1.real)-(c2.real);
b=(c1.img)-(c2.img);
 std::cout<<a<<"+"<<b<<"i";   
     break;
  case 3:
    a=((c1.real)*(c2.real))-((c1.img)*(c2.img));
b=((c1.real)*(c2.img))+((c2.real)*(c1.img));
     std::cout<<a<<b<<"i";
    break;
    default :
      std::cout<<"Invalid choice";
}
}