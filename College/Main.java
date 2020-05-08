#include<iostream>
#include <bits/stdc++.h>
using namespace std;
typedef struct College 
{ 
  char name[100];
  char city[100];
  int establishmentYear;
  float passPercentage; 
}d;
bool compare(d a, d b)
{
	if(a.name > b.name)		
		return 1;
	else
		return 0;
}
 
int main()
{
  int n,i;
  std::cout<<"Enter the number of colleges\n";
  std::cin>>n;
  d s[n];
  for(i=0;i<n;i++)
  {
    std::cout<<"Enter the details of college "<<i+1<<"\nEnter name\n";
    std::cin>>s[i].name;
    std::cout<<"Enter city\n";
    std::cin>>s[i].city;
    std::cout<<"Enter year of establishment\n";
    std::cin>>s[i].establishmentYear;
    std::cout<<"Enter pass percentage\n";
    std::cin>>s[i].passPercentage;
  }
  sort(s,s+n,compare);
 
  std::cout<<"Details of colleges\n";
  for(i=0;i<n;i++)
  {
    std::cout<<"College:"<<i+1<<"\n";
    std::cout<<"Name:"<<s[i].name<<"\n";
    std::cout<<"City:"<<s[i].city<<"\n";
    std::cout<<"Year of establishment:"<<s[i].establishmentYear<<"\n";
    std::cout<<"Pass percentage:"<<s[i].passPercentage<<"\n";
  }
}