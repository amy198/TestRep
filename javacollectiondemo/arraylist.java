package javacollectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> roll_no = new ArrayList<Integer>();
		roll_no.add(1005);
		roll_no.add(1002);
		roll_no.add(0, 1000);
		System.out.println(roll_no);
		
		System.out.println(roll_no.contains(1003));
		Collections.sort(roll_no);
		System.out.println(roll_no);
		System.out.println(roll_no.size());
		for (int i=0;i<roll_no.size();i++) {
			System.out.println(roll_no.get(i));
		}
		
		

	}

}
