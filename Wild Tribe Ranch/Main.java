#include<iostream>
int main()
{
  int num1,num2;
  std::cin>>num1;
  std::cin>>num2;
  if(num2<num1)
  {
    std::cout<<"Yes, you can enter.";
  }
  else if(num1==num2)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}
  