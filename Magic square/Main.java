#include<iostream>
using namespace std;
int main()
{
    int n,i,j,sum=0,ds=0;
  std::cin>>n;
  int a[n][n];
  for(i=0;i<n;i++)
    {
       for(j=0;j<n;j++)
         std::cin>>a[i][j];
    }
  for(i=0;i<n;i++)
    {
       for(j=0;j<n;j++)
       {
         sum+=a[i][j];
         if(i==j)
           ds+=a[i][j];
       }
    }
  int k=2*n;
  if(ds==((2*sum)/k))
    std::cout<<"Yes";
  else
    std::cout<<"No";
}