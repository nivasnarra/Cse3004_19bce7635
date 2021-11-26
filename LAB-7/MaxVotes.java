import java.util.*;
 import java.io.*; 
public class MaxVotes 
{
private static int getMaxVotes(int[] a, int left, intright) 
{
if (left == right) 
{
return -1;
}
if (left + 1 == right) 
{
 return a[left];
}
int num = right -left;
int majorityIndex= left;
int count = 1;
for (int i = left + 1 ;i< right; i++)
 {
if (a[i] == a[majorityIndex])
 count++; 
else
 {
 count--;
}
 if (count == 0) 
{
 majorityIndex = i; 
count = 1;
}
}
 int finalCount = 0; 
for (int i = left; i < right; i++)
 {
 if (a[i] == a[majorityIndex]) 
finalCount ++;
}
 if (finalCount > num/2) 
return majorityIndex; return -1;
} 
public static void main(String[] args) 
{
 FastScanner sc = new FastScanner(System.in);
 int n =sc.nextInt();
int[] a = new int[n]; 
for (int i = 0; i < n; i++) 
{
 a[i] = sc.nextInt();
}
 if (getMaxVotes(a, 0, a.length) != -1) 
{
System.out.println(1);
}
 else
{
System.out.println(0);
}
}
 static class FastScanner 
{
BufferedReader br;
StringTokenizer st;
FastScanner(InputStream stream) 
{
 try 
{
 br = new BufferedReader(newInputStreamReader(stream));
}
 catch (Exception e) 
{
e.printStackTrace();
}
}
String next() 
{
 while (st == null || !st.hasMoreTokens()) 
{
 try
{
 st = new StringTokenizer(br.readLine());
} 
catch (IOException e) 
{
e.printStackTrace();
}
}
 return st.nextToken();
} 
int nextInt() 
{
 return Integer.parseInt(next());
}
}
}