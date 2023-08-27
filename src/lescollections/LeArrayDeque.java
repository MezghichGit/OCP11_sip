package lescollections;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class LeArrayDeque {
	
	public static void main(String[] args) {
		
		//Exemple avec fifo
		/*
		ArrayDeque<Integer> file = new ArrayDeque<>();
		file.offer(10);
		file.offer(4);
		file.offer(2);
		
		System.out.println(file.peek()); //10
		System.out.println(file.poll()); //10
		System.out.println(file.peek()); //4
		*/
		
		//Exemple avec lifo
	    ArrayDeque<Integer> lifo= new ArrayDeque<>();
	    lifo.push(10);
	    lifo.push(4);
	    lifo.push(2);
		
		System.out.println(lifo.peek()); //2
		System.out.println(lifo.pop()); //2
		System.out.println(lifo.peek()); //4
		
		Map<String, Double> map = new HashMap<>();
		map.put("e",12D);
		
	}

}
