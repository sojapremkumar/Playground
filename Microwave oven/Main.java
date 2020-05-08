#include<iostream>
using namespace std;
int main()
{
int num;
  float heat;
  cin>>num;
  cin>>heat;
  if(num==2)
  {
    float h=heat+(heat*50)/100;
    cout<<h;
  }
  else if(num==3)
  {
    float h1=2*heat;
    cout<<h1;
  }
  else 
    cout<<"Number of items is more";
}