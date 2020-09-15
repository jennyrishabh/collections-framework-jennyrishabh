package collectionframework;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class question9 {

	public static void main(String[] args)throws IOException {
		HashMap<String,Integer> hm=new HashMap<>();
		File f =new File("C:\\Users\\Administrator\\Music\\CSE 2 year\\ewa\\alice_in_wonderland.txt");
		BufferedReader bf= new BufferedReader(new FileReader(f));
		Pattern p=Pattern.compile("[a-zA-Z]+");Pattern p1=Pattern.compile("\\s");		
		String line=bf.readLine();
		while(line!=null) {	
		   String[] s=p1.split(line);
			for(String st : s) {
				int count=1;
				Matcher m=p.matcher(st);	
					while(m.find() && m.group().equals(st)) {					
							Integer previousvalue = hm.putIfAbsent(m.group(), count);
							if(previousvalue!=null) {previousvalue++;hm.put(m.group(), previousvalue);}
							//count++;
					}
				
			}
				
			line=bf.readLine();		
		
		}
		
		Iterator<Entry<String ,Integer>> it=hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String,Integer> en=it.next();
			System.out.println(en.getKey()+"-> "+en.getValue());	
		}
			
		bf.close();

	}

}
