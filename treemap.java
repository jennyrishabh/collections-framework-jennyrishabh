import java.util.*;
import java.util.HashMap;
import java.util.Iterator;	//19csu247
import java.util.Map;
import java.util.Map.Entry;
public class Main
{
    
	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>();Scanner sc=new Scanner(System.in);
		char temp='y';
		while(temp=='y'){
		System.out.println("1.add");
		System.out.println("2.remove students");
		System.out.println("3.modify grades");
		System.out.println("4. print all grades");
		int choice=sc.nextInt();
		if(choice==1){System.out.println("enter the name of student");String name=sc.next();
		              System.out.println("enter the grade of student");String grade=sc.next();
		              tm.put(name,grade);
		    
		}
		else if (choice==2){System.out.println("enter the name of student to remove");String name=sc.next();
		               tm.remove(name);
		    
		       }
        		else if(choice==3){System.out.println("enter the name of student to modify");String name=sc.next();
        		              System.out.println("enter the grade changed::");String grade=sc.next();
        		              System.out.println("previous grade was::"+tm.put(name,grade));
        		              System.out.println("grade updated::");
        		}
		else if(choice==4){
			//prints in random order::
		    // for (Map.Entry<String, String> set : tm.entrySet()) {
		    // System.out.println(set.getKey() + " = " + set.getValue());
		    // }

//	--->		prints in sorted order

			 Iterator<Entry<String, String>> it = tm.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry<String, String> set = (Map.Entry<String, String>) it.next();
				System.out.println(set.getKey() + " = " + set.getValue());
			}
		}
		else {System.out.println("ERROR::");}
		System.out.println("do u wnat to continue:: press y and n to exit");
		temp=sc.next().charAt(0);
		
		}
		System.out.println("system will now exit::  :( ");
		System.exit(0);
		
		//System.out.println("Hello World");
	}
}
