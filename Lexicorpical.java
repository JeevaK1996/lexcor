# lexcor
package logicbuilding;

import java.util.Scanner;
import java.util.TreeSet;

public class Lexicorpical {

	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String []s=new String[5];
		 TreeSet<String> treeSet=new TreeSet<>();
		for(int i=0;i<s.length;i++){
			s[i]=scanner.next();
			   treeSet.add(s[i]);
		}
		for(String s1:treeSet){
	            System.out.println(s1);
	        }
	}

}
