#include<iostream>
using namespace std;
int main(){
  int n,i,count=0,odd=0;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      count++;
    }
    else
      odd++;
  }
  std::cout<<odd<<"\n";
  std::cout<<count;
  return 0;
}