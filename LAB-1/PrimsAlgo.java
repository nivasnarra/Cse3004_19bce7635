import java.util.*;
import java.lang.*;
import java.io.*;
class PrimsAlgo {
int mKey(int key[], Boolean mstSet[],int 
{int m = Integer.MAX_VALUE, m_i = -1;
for (int v = 0; v < V; v+
if (mstSet[v] == false && key[v] < m
m = key[v];m_i =v;
}
}
void print(int p[], int g[][],int V){
System.out.println("Edge \tWeight");
for (int i = 1; i < V; i++)
System.out.println(p[i] + " - " + i + "\t" + "\t"+ g[i][p[i]]);
}
void prims(int g[][],int V){
int p[] = new int[V];
int key[] = new int[V];
Boolean mstSet[] = new Boolean[V];
for (int i = 0; i < V; i++) 
{
key[i] = Integer.MAX_VALUE;
mstSet[i] = false;
}
key[0] = 0;
 p[0] = -1; 
for (int c = 0; c < V - 1; c++) 
{
int u = mKey(key, mstSet,V);
mstSet[u] = true;
for (int v = 0; v < V; v++)
if (g[u][v] != 0 && mstSet[v] == false && g[u][v] < key[v])
 {
p[v] = u;
key[v] = g[u][v];
}}
print(p, g,V);
}
public static void main(String[] args)
{
//Inputting g from userScanner 
sc=new Scanner(System.in);
System.out.println("Enter number of nodes");
int n=sc.nextInt();
System.out.println("Enter weights of nodes : ");
int g[][]=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
g[i][j]=sc.nextInt();
}
}
PrimsAlgo t = new PrimsAlgo();
t.prims(g,n);
}
}