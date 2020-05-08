#include<iostream>
#include <bits/stdc++.h>
using namespace std;
typedef struct Student
{
  char name[30];
  char department[20];
  int yearOfStudy;
  float cgpa; 
}d;
bool compare(d a, d b)
{
	if(a.name < b.name)		
		return 1;
	else
		return 0;
}
 
int main()
{
  int n,i;
  std::cout<<"Enter the number of students\n";
  std::cin>>n;
  d s[n];
  for(i=0;i<n;i++)
  {
    std::cout<<"Enter the details of student "<<i+1<<"\nEnter name\n";
    std::cin>>s[i].name;
    std::cout<<"Enter department\n";
    std::cin>>s[i].department;
    std::cout<<"Enter year of study\n";
    std::cin>>s[i].yearOfStudy;
    std::cout<<"Enter cgpa\n";
    std::cin>>s[i].cgpa;
  }
  sort(s,s+n,compare);
 
  std::cout<<"Details of students\n";
  for(i=0;i<n;i++)
  {
    std::cout<<"Student "<<i+1<<"\n";
    std::cout<<"Name:"<<s[i].name<<"\n";
    std::cout<<"Department:"<<s[i].department<<"\n";
    std::cout<<"Year of study:"<<s[i].yearOfStudy<<"\n";
    std::cout<<"CGPA:"<<s[i].cgpa<<"\n";
  }
}