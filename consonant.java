import java.io.*;
import java.lang.*;
class consonant
{
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char c;
System.out.println("Enter any character:");
c=(char)br.read();
if((c>=65||c<=90)||(c>=97&&c<=122))
System.out.println(c+" is cononant");
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
System.out.println(c+" is vowel");

}
}
