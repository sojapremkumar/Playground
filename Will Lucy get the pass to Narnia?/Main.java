#include<iostream>
int main()
{
  int a,b,sum;
  int ch;
 std::cout<<"Enter first number : ";
  std::cin>>a;
  std::cout<<"Enter second number : ";
  std::cin>>b;
   std::cout<<"Menu\n";
   std::cin>>ch;
  std::cout<<"1.Addition\n";
 std::cout<<"2.Subtraction\n";
   std::cout<<"3.Multiplication\n";
   std::cout<<"4.Division\n";
   std::cout<<"5.Remainder\n";
  
  switch(ch)
  {
    case 1:
      sum=a+b;
      std::cout<<sum;
      break;
    case 2:
      sum=a-b;
      std::cout<<sum;
      break;
    case 3:
      sum=a*b;
      std::cout<<sum;
      break;
    case 4:
      sum=a/b;
      std::cout<<sum;
      break;
      case 5:
      sum=a%b;
      std::cout<<sum;
      break;
    default:
      std::cout<<"Invalid operation";
  }
}