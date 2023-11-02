package javacollectiondemo;

import java.util.HashSet;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Hashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> trainee = new HashSet<String>();
		trainee.add("amita");
		trainee.add("neha");
		trainee.add("amita");
		trainee.add("swati");
		trainee.remove("amita");
		System.out.println(trainee);
		
		Iterator<String> itr=trainee.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
