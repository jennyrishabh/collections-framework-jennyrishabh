import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
/*
 * :::root_Kali@Rjain$:::
 */
public class queue {
	public static void main(String a[]) {		
		Scanner sc=new Scanner(System.in);
		Queue<Integer> q=new LinkedList<>();
		Stack<Integer> s=new Stack<>();		
		for(int i=1;i<11;i++){s.push(i);}
		System.out.println("we have the following cars position::");
		for(int i=10;i>0;i--) {System.out.println(i);}
		System.out.println("enter the position u want to remove ::");
		int position=sc.nextInt();
		
		for(int i=10;i>=position;i--){			
			int temp=s.pop();
			if(i==position) {continue;}
			q.offer(temp);			
		
		}
		//System.out.println(q.size());
		for(int i=q.size();i>0;i--){			
			Integer temp=q.poll();
			if(temp!=null) {s.push(temp);}
			else {s.push(0);}			
			//sSystem.out.println(temp+ " ");			
		}		
		//printing stack::
		System.out.println("after remove car at "+position +"th position parking lot is:");
		while(!s.isEmpty()) {System.out.println(s.pop()+" ");}  //or !s.empty()
		sc.close();
		
	}	
	
}
