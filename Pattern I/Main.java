#include<iostream>
int main()
{
  int n,a,b,c;
  std::cin>>n;
  a=n;
  for(int i=1;i<=4;i++)
    {
        for(int k=1;k<=i;k++)
        {
            std::cout<<a;
        }
        a++;
        std::cout<<"\n";
    }
  a--;
  for(int j=4;j>=1;j--)
  {
    for(int m=j;m>=1;m--)
    {std::cout<<a;
    }
  a--;
    std::cout<<"\n";
}
}