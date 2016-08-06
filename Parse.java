# Parse
import java.util.Scanner;

public class Parse{


	public static void main(String[] args) {
		
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the string : ");
    String s1=sc.nextLine();
    StringBuffer sb=new StringBuffer(s1);
    String s2=sb.reverse().toString();
    char ch[]=s2.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
    	String s3 = ch[i]+"_";
    	System.out.print(s3);
    }
	}

}
