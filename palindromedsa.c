bool isPalindrome(int x){
int n,rem,rev=0;
n=x;
if(x<0){
    return false;
}
while(x!=0){
rem=x%10;
rev=(rev*10)+rem;
x=x/10;
}
if(rev==n)
{
    return true;
}
else
{
    return false;
}
}
