import java.io.*;

class Sample{
public static void main(String args[])throws IOException
{
int n;
System.out.println("hi....Enter Integer Value:");
DataInputStream d = new DataInputStream(System.in);
n=Integer.parseInt(d.readLine());
System.out.println(n);
}
}