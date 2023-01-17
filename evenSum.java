import java.util.Scanner;

 class  Solution {
public static void main(String args[])
{
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int i=2;
    int sum=0;
    while(i<=n)
    {
        sum=sum+i;
        i=i+2;
    }
        System.out.println(sum);
}
}