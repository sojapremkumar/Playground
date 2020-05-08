#include<iostream>
using namespace std;
void typ(int a[],int n)
{
  int es=0,os=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      es++;
    else
      os++;
  }
  if(es==n)
    std::cout<<"The array is Even";
  else if(os==n)
    std::cout<<"The array is Odd";
  else
    std::cout<<"The array is Mixed";
}
int main()
{
  int n,i;
  std::cout<<"Enter the number of elements in the array \n";
  std::cin>>n;
  int a[n];
  std::cout<<"Enter the elements in the array \n";
  for(i=0;i<n;i++)
    std::cin>>a[i];
  typ(a,n);
}