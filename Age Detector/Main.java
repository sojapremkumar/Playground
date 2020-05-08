#include<iostream>
using namespace std;
int main()
{
int a,b,age;
  std::cin>>a;
  std::cin>>b;
   if(b<a)
  {
    a=100-a;
   age=a+b;
      std::cout<<age;
  }
  else
  {
    age=b-a;
   std::cout<<age;
  }

}