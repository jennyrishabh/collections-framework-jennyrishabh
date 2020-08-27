/**
 * 
 */
package collectionframework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

/*
 * :::root_Kali@Rjain$:::
 */
public class filereading1 {

	public static void main(String a[]) throws FileNotFoundException, IOException {

		File f = new File("C:\\Users\\Administrator\\Music\\java\\filereading2.txt");
		BufferedReader bf = new BufferedReader(new FileReader(f));

		ArrayList<Character> ar = new ArrayList<>();
		ArrayList<Character> ar1 = new ArrayList<>();

		// ------->
		ArrayList<String> ar2 = new ArrayList<>();
		// ArrayList<String> ar3=new ArrayList<>();

		int sr;
		System.out.println("The contents of the file are: ");

		while ((sr = bf.read()) != -1) {

			char ch = (char) sr;
			ar.add(ch);
			// System.out.print(ch + " ");
		}

		for (char tt : ar) {
			System.out.print(tt + "");
		}

// QUESTION:: ASK ANOTHER WAY TO closing and repointing the pointer to beginning ;

		bf.close();

		bf = new BufferedReader(new FileReader(f));

		System.out.println("\n\nstoring words in arrayList using string ::");

		String sr1 = null;
		while ((sr1 = bf.readLine()) != null) {
			String[] test = sr1.split(" ");

			for (int i = 0; i < test.length; i++) {
				ar2.add(test[i]);

			}

		}

		for (String abc : ar2) {
			System.out.print(abc + " ");
		}

		// ----------------------------------------------------\

		bf.close();

		bf = new BufferedReader(new FileReader(f));

		// reset pointer to point to beginning ::

		String[] words = null;
		String word = null;

		// System.out.println(word);
		System.out.println("\n\nin string array::::-------------->");
		while ((word = bf.readLine()) != null) {
			// System.out.println("in while loop");
			words = word.split(" ");

		}
		System.out.println("\nin string [] ");
		for (String tt : words) {
			System.out.print(tt + " ");
		}

		System.out.println("\n\nwords ending in 'S'");
		for (int i = 0; i < words.length; i++) {

			int m = words[i].length();
			// System.out.println("\n"+m + " " +words[i].charAt(m-1));
			if (words[i].charAt(m - 1) == 's') {

				ar2.remove(words[i]);
				System.out.print(words[i] + " ");
				// words1[i]=words[i];

			}

		}

		System.out.println("\n\nlist without 's' r::");

		for (String tt : ar2) {
			System.out.print(tt + " ");
		}

		// -----------------------------------------------------

		ListIterator<Character> it12 = ar.listIterator();

		while (it12.hasNext()) {
			it12.next();
		}

		System.out.println("\n\nIn reverse order is ::");

		while (it12.hasPrevious()) {
			char ch12 = it12.previous();
			ar1.add(ch12);
			System.out.print(ch12 + "");
		}

		System.out.println("\n\nstorede in new array;list:: ");

		// ar.clear();

		for (char tt : ar1) {
			System.out.print(tt + "");
		}

		bf.close();

	}

}
