import java.util.*;
class Main
{
   static int coins[] = {1,5,10};
static int n = coins.length;
static void findMin(int A) 
 {
Vector<Integer> mincoins = new Vector<>();
for (int i = n -1; i >= 0; i--)
{
while (A >= coins[i])
{
A -= coins[i];
mincoins.add(coins[i]);
}
}
   for (int i = 0; i < mincoins.size(); i++)
{
System.out.print(" " + mincoins.elementAt(i));
}
 }public static void main(String[] args)
  {
int n ;
Scanner in=new Scanner(System.in);
n=in.nextInt();
System.out.print(" Minimum coin change : " );
findMin(n);
}
}