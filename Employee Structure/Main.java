#include<iostream>
using namespace std;
struct employee
{
  char name[50];
  char dest[50];
  int id;
  int age;
  float sal;
};
int main()
{
  employee e;
  std::cout<<"Enter name:";
  std::cin>>e.name;
  std::cout<<"\nEnter ID:";
  std::cin>>e.id;
  std::cout<<"\nEnter age:";
  std::cin>>e.age;
  std::cout<<"\nEnter designation:";
  std::cin>>e.dest;
  std::cout<<"\nEnter Salary:";
  std::cin>>e.sal;
  std::cout<<"\nEmployee Details\n";
  std::cout<<"Name of the Employee : "<<e.name<<"\n";
  std::cout<<"ID of the Employee : "<<e.id<<"\n";
  std::cout<<"Age of the Employee : "<<e.age<<"\n";
  std::cout<<"Designation of the Employee : "<<e.dest<<"\n";
  std::cout<<"\Salary of the Employee : "<<e.sal<< "\n";
}