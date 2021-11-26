import java.util.*;
public class Main
{
public static String largestnumber(String[]salaryParts)
{
int numParts = salaryParts.length;
if(salaryParts == null || numParts == 0)
return "";
String[]maxSalary = new String[numParts];
for(int i =0;i<numParts;++i) 
{
maxSalary[i] =String.valueOf(salaryParts[i]);
}
Arrays.sort(maxSalary, (s1,s2)->(s2 +s1).compareTo(s1 + s2));
StringBuilder sb = new StringBuilder();
for(String salaryPart : maxSalary)
 {
sb.append(salaryPart);
}
return sb.toString();
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String[] salaryParts = new String[n];
for(int i= 0;i<n;i++)
{
salaryParts[i] =sc.next();
}
System.out.println(largestnumber(salaryParts));
}
}