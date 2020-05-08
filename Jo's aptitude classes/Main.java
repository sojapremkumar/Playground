#include<iostream>
int small(int num1,int num2,int num3)
{
int s;
  if(num1<=num2 && num1 <=num3){
        s=num1;
    }
    if(num2<=num1 && num2 <=num3){
       s=num2;
    }
    if(num3<=num1 && num3 <=num2){
        s=num3;
    }
    
return s;
  }

int main()
{
int a,b,c,result,d=0,i;
std::cin>>a;
std::cin>>b;
std::cin>>c;
std::cin>>result;
int sm=small(a,b,c);
for(i=sm;i>0;i--)
{
if(a%i==0&&b%i==0)
{if(c%i==0)
 d=i;
    break;
}
}
if(result!=d)
std::cout<<"Answer is wrong.";
else
std::cout<<"Answer is correct.";
}