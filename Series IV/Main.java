#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a=1,n,b,c;
std::cin>>n;
for(int i=1; i<=n; i++)
{ 
b=(pow(a, 2));
if(i%2==0)
{c=b-2;}
else 
 {c=b-1;}
std::cout<<c<<" ";
a=a+1;
}
}