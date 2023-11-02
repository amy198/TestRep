package javacollectiondemo;

import java.util.HashMap;

public class HashMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//key value pair
		HashMap<Integer, String> trainee= new HashMap<Integer, String>();
		trainee.put(1, "singh");
		trainee.put(2, "mishra");
		trainee.put(3, "amita");
		trainee.put(4, "amy");
		System.out.println(trainee.get(3));
		
		System.out.println(trainee.get(3));
		System.out.println(trainee.containsValue("amita"));
		System.out.println(trainee);
		trainee.remove(2);
		System.out.println(trainee);
		
		
		
		

	}

}
