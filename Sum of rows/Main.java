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
  for(i=0;i<r;i++)
    {
      int ns=0;
       for(j=0;j<c;j++)
       {
         ns=ns+a[i][j];
       }
      std::cout<<ns<<"\n";
    }
}