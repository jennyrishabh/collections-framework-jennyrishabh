/**
 * 
 */
package collectionframework;

/*
 * :::root_Kali@Rjain$:::
 */
import java.util.*;

class gen<T>{
    
    ArrayList<T> l;
    gen(ArrayList<T> l){
        this.l=l;
    }
    
    int check(){
        int count=0;
        System.out.println();
        for(int i=0;i<l.size();i++){
            int temp=(int)l.get(i);
            if(temp%2 != 0 ){System.out.print(temp+" ");count++;}
        }
        return count;
    }
    
    int checkp(){
        int count=0;
        System.out.println("palindrome's string in list were...");
        for(int i=0;i<l.size();i++){
            String temp=(String)l.get(i),newtemp="";
            //System.out.println(temp);
                for(int j=temp.length()-1;j>=0;j--){
                    newtemp+=temp.charAt(j);
                }
                //System.out.println(newtemp);
                if(newtemp.equals(temp)){System.out.print(newtemp+" ");count++;}
        }
        return count;
    }
}


public class generics
{
	public static void main(String[] args) {
		
//		ArrayList<Integer> list=new ArrayList<>();
//		for(int i=0;i<40;i++){list.add(i);}
//		gen<Integer> g1=new gen<>(list);
//		System.out.println("odd no. r..."+g1.check());
		
 		ArrayList<String> list2=new ArrayList<>();
 	    list2.add("abcba");list2.add("abc");list2.add("bca");list2.add("abccba");list2.add("abba");
 	    System.out.println("words in string r...."+list2);
 		gen<String> g2=new gen<>(list2);
 		System.out.println("\n\nPalindrome no. of words were  ..."+g2.checkp());
	}
}
