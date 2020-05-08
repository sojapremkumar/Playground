#include <iostream>
#include<string.h>
#include<cstring>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   struct student ob1;
  gets(ob1.name);
  std::cin>>ob1.roll;
  std::cin>>ob1.marks;
  std::cout<<"\nStudent Details";
  std::cout<<"\nName: "<<ob1.name;
   std::cout<<"\nRoll: "<<ob1.roll;
  std::cout<<"\nMarks: "<<ob1.marks;
}