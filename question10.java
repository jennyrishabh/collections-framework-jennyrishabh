import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class players{
	String name; 
	int score;	
	players(String name,int score){
		this.name = name;
		this.score = score;
	}

	public String getname() {
		return name;
	}

	public int getscore() {
		return score;
	}	
	
	public String toString() {
		return "\n Name:"+ this.name+" Score: "+this.score;
	}

}

public class question10 {

	public static void main(String[] args) {
		List<players> list = new ArrayList<>();
		list.add(new players("harry", 150));
		list.add(new players("jessi", 203));
		list.add(new players("john", 75));
		list.add(new players("david", 100));
		list.add(new players("amy", 100));
		
		Comparator<players> score = new Comparator<players>(){
				@Override
				public int compare(players m1, players m2) {
					if(m1.getscore() < m2.getscore()) {
						return -1;
					}
					else if(m1.getscore() > m2.getscore())
						return 1;
					else
						return m1.getname().compareTo(m2.getname());
					}
		};

		System.out.println("list before sorting by score.....:"+list.toString());
		Collections.sort(list, score);System.out.println();		
		System.out.println("players.. Sorted According to score: "+list.toString());		
		
	}

}