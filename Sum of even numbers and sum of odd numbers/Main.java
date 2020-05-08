#include<iostream>
using namespace std;
int main()
{
  int n;
    int i,oddSum=0,evenSum=0;
  std::cin>>n;
     int arr[n];
  for(i=0;i<n;i++)
  {
    std::cin>>arr[i];
  }
  
    for(i=0; i<n; i++){
        if(arr[i]%2==0){
        evenSum=evenSum+arr[i];
        }
    else{
             oddSum=oddSum+arr[i];
        }
    }
   cout<<"The sum of the even numbers in the array is "<<evenSum<<"\n";
    cout<<"The sum of the odd numbers in the array is "<<oddSum;
   
    return 0;

}