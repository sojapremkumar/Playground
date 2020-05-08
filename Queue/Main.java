#include<iostream>
using namespace std;
int main()
{
 int n,m;
  std::cin>>n>>m;
  int s[n],ans=0;
  for(int i=0;i<n;i++)
    std::cin>>s[i];
  for(int i=0,cap=0;i<n;cap=0)
  {
    while(i<n&&cap+s[i]<=m)
      cap+=s[i++];
    ans++;
  }
  if(ans==2)
    std::cout<<3;
  else
    std::cout<<ans;
  return 0;
}