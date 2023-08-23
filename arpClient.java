import java.io.*;
import java.net.*; 
import java.util.*; 
public class arpClient 
{ 
public static void main(String args[]) 
{ 
try 
{ 
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
Socket clsct=new Socket("127.0.0.1",200); 
DataInputStream din=new DataInputStream(clsct.getInputStream()); 
DataOutputStream dout=new DataOutputStream(clsct.getOutputStream()); 
System.out.println("Enter the Logical address(IP):"); 
String str1=in.readLine(); 
dout.writeUTF(str1+'\n'); 
String str=din.readUTF(); 
System.out.println("The Physical Address is: "+str); 
clsct.close(); 
} 
catch (Exception e) 
{ 
System.out.println(e); 
} 
} 
} 
