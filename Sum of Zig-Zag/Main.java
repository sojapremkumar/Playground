#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,sum=0;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
      std::cin>>a[i][j];
  }
  for(i=0;i<1;i++)
  {
    for(j=0;j<c;j++)
      sum+=a[i][j];
  }
    i=r-1;
    for(j=0;j<c;j++)
      sum+=a[i][j];
  int n=r-1;
  r=1;
  c=c-2;
  while((r>n)&&(c>0))
  {
    sum+=a[r][c];
    r=r+1;
    c=c-1;
  }
  if(r==c)
    sum+=a[r][c];
  std::cout<<"Sum of Zig-Zag pattern is "<<sum;
}