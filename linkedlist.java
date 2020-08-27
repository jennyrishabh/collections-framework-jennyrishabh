import java.util.LinkedList;
import java.util.ListIterator;
public class linkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		LinkedList<String> staff = new LinkedList<>();
		
		ListIterator<String> iterator = staff.listIterator();
		
		iterator.add("Tom");
		iterator.add("Diana");
		iterator.add("Harry");
		
		iterator = staff.listIterator();
		
		if(iterator.next().equals("Tom")){
			iterator.remove();
		}
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(list);
	
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Linked list in reverse order:");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		
		
		
		
	}

}