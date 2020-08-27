import java.util.Stack;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a line::");
		Stack<String> st=new Stack<>();
		String line=sc.nextLine();
		//by either by spaces or dot opertor we have to seperate.
		String[] s=line.split("[. ]"); 
		//last word's first letter must be an UpperCase().
		for (int i=0;i<s.length;i++){
		    if(i==s.length-1){char c=s[i].charAt(0);char c1=(char)(c-32);String test=s[i].replace(c , c1);st.push(test);}
		    else{st.push(s[i]);}
		   
		}
		while(!st.empty()){
		    System.out.print(" "+st.pop());
		}
		System.out.print(".");

        
	}
}
 