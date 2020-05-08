#include<iostream>
using namespace std;
int main()
{
 int r,c,i,j,max=0;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    {
       for(j=0;j<c;j++)
         std::cin>>a[i][j];
    }
  for(i=0;i<c;i++)
    {
       max=0;
       for(j=0;j<r;j++)
       {
         if(max<a[j][i])
           max=a[j][i];
       }
      std::cout<<max<<"\n";
    }
}