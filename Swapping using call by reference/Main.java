#include<iostream>
using namespace std;
void swap(int &,int &);
int main()
{
int x,y;
std::cin>>x>>y;
std::cout<<"Before swapping a= "<<x<<" and b="<<y<<"\n";
swap(x,y);
std::cout<<"After swapping a= "<<x<<" and b="<<y;
}
void swap(int &x,int &y)
{
int c;
c=x;
x=y;
y=c;
}