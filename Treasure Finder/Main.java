#include<iostream>
using namespace std;
int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
  
int main()
{
  int a,b,c,small;
  std::cin>>a>>b>>c;
  if((a<b && b<c) || (c<b and b<a))
     small=b;
  if((b<a && a<c) || (c<a and a<b))
     small=a;
  if((a<c && c<b) || (b<c and c<a))
     small=c;
  std::cout<<"The treasure is in box which has number "<<small<<"\n";
  std::cout<<"The code to open the box is "<<gcd(a, gcd(b, c));
}
