import java.io.*;
import java.lang.*;
class consonant
{
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char arr1[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
char c;
System.out.println("Enter any character:");
c=(char)br.read();
for(int i=0;i<26;i++)
{
if(c==arr1[i])
System.out.println(c+" is cononant");
}
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
System.out.println(c+" is vowel");
else
System.out.println("Invalid input");

}
}
