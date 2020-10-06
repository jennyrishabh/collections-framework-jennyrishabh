import java.util.*;
class factorial extends Thread{         //19CSU247
    private int number;
    
    factorial(int number){
        this.number=number;
    }
    public void run(){
        int temp=1;
       for (int i=1;i<=number;i++){
           temp=temp*i;
       }  
       
       System.out.println("factorial for the given number:"+number+" is.."+temp);
    }
    
}
class factor extends Thread{
     private int number;
    
    factor(int number){
        this.number=number;
    }
    
  public void run(){
        System.out.println("printing the factors of the given number "+number);
        for (int i=1;i<=number;i++){
            if(number%i==0){System.out.print(" "+i);}
        } 
    }
      
    
}
public class Main
{
	public static void main(String[] args) throws InterruptedException{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number...");
	    int number=sc.nextInt();
		factorial obj1=new factorial(number);
		factor obj2=new factor(number);
		obj1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		obj2.start();
		
		obj1.join();
		obj2.join();
		
		System.out.println("\nending of the "+Thread.currentThread().getName()+" Thread...");
		
	}
}
