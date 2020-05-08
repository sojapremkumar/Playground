#include<iostream>
using namespace std;
int main()
{
 int n,a[15],i,reg,flag=0;
  cin>>n;
  for(i=0;i<n;i++){
     cin>>a[i];
  }
  cin>>reg;
   for(i=0;i<n;i++){
     if(a[i]==reg){
        flag=1;
        break;
      }
    }
  if(flag==1)
     cout<<"She passed her exam";
  else
     cout<<"She failed";
 return 0;
} 