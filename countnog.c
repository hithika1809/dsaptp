#include<stdio.h>
int main(){
  int n,count=0,rem,num;
  printf("Enter number:");
  scanf("%d",&n);
  num=n;
  while(n!=0){
   rem=n%10;
   if(num%rem==0)
   {
       count++;
   }
   n=n/10;
   }
   printf("%d",count);
  }

