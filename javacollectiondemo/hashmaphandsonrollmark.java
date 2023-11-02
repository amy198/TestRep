package javacollectiondemo;

import java.util.HashMap;
import java.util.Map;

public class hashmaphandsonrollmark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> batch = new HashMap<Integer, Integer>();
		batch.put(1, 40);
		batch.put(2, 50);
		batch.put(3, 95);
		batch.put(4, 70);
		batch.put(5, 82);
		
		
		System.out.println(batch);
		for (Map.Entry<Integer, Integer> entry: batch.entrySet()){
			System.out.println(batch.containsValue("amita"));
			
			
		}
	}

}
