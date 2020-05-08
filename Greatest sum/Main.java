#include<iostream>
using namespace std;
int main()
{
   int r,c,i,j,max=0,a1,b;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    {
       for(j=0;j<c;j++)
         std::cin>>a[i][j];
    }
  int rs=0;
  std::cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
    {
      int ns=0;
       for(j=0;j<c;j++)
       {
         ns=ns+a[i][j];
       }
      std::cout<<ns<<" ";
      if(rs<ns)
      {
        rs=ns;
        a1=i;
      }
    }
  std::cout<<"\n"<<"Row "<<a1+1<<" has maximum sum \n";
  int cs=0;
  std::cout<<"Sum of columns is ";
  for(i=0;i<c;i++)
    {
      int ns=0;
       for(j=0;j<r;j++)
       {
         ns=ns+a[j][i];
       }
      std::cout<<ns<<" ";
      if(cs<ns)
      {
        cs=ns;
        b=i;
      }
    }
  std::cout<<"\nColumn "<<b+1<<" has maximum sum \n";
}