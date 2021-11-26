import java.util.Scanner;
public class OnlineBet
 {
 private static int[] naive(int[] starts, int[] ends,int[] points) 
{
 int[] cnt = new int[points.length]; 
for (int i = 0; i < points.length; i++)
 {
 for (int j = 0; j < starts.length; j++)
 {
 if (starts[j] <= points[i] && points[i] <=ends[j]) 
{
 cnt[i]++;
}
}
 }
 return cnt;
}
public static void main(String[] args) 
{ 
Scanner sc = new Scanner(System.in); 
int n, m;
n = sc.nextInt(); 
m = sc.nextInt(); 
int[] starts = new int[n]; 
int[] ends = new int[n]; 
int[] points = new int[m]; 
for (int i = 0; i < n; i++) 
{
 starts[i] = sc.nextInt();
 ends[i] = sc.nextInt();
}
 for (int i = 0; i < m; i++) 
{
 points[i] = sc.nextInt();
}
 int[] cnt = naive(starts, ends, points); 
for (int x : cnt)
 {
System.out.print(x + " ");
}
}
}