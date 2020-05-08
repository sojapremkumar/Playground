#include<iostream>
using namespace std;
int main()
{
int a;
 double t;
 std::cin>>a>>t;
 if((13<a) && (t==13.3))
   std::cout<<"$5.00";
 else if((a<=13) && (t==13.3))
   std::cout<<"$2.00";
 else if(a>13 && (t!=13.3))
   std::cout<<"$8.00";
 else if(a<=13 && (t!=13.3))
   std::cout<<"$4.00";
}