#include<iostream>
using namespace std;
int main()
{
    int n,i,p,k;
  std::cout<<"Enter the number of elements in the array\n";
  std::cin>>n;
  int a[n];
  std::cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
    std::cin>>a[i];
  std::cout<<"Enter the location where you wish to insert an element \n";
  std::cin>>k;
  if(k>=n)
    std::cout<<"Invalid Input";
  else
  {
    std::cout<<"Enter the value to insert \n";
    std::cin>>p;
    k=k-1;
    int temp=a[k];
    a[k]=p;
    k=k+1;
    for(i=k;i<=n;i++)
    {
      int temp1=a[k];
      a[i]=temp;
      temp=temp1;
    }
    a[k-1]=p;
    std::cout<<"Array after insertion is \n";
    for(i=0;i<=n;i++)
      std::cout<<a[i]<<"\n";
  }
}