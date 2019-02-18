package com.jetherrodrigues.aceleradev;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class AppMap {

	public static void main(String[] args) {
		Map<String, Integer> estoque = new HashMap<>();
		estoque.put("Banana", 3);
		estoque.put("Melao", 5);
		estoque.put("Coca-Cola", 10);
		estoque.put("Cerveja", 20);
		estoque.put("Vinho", 1);
		
		System.out.println(estoque.get("Banana"));
		System.out.println(estoque);
		
		for (Map.Entry<String, Integer> tupla : estoque.entrySet()) {
			System.out.println("Key: " + tupla.getKey() + " - Value: " + tupla.getValue());
		}
		
		estoque.merge("Banana", 3, (k,v) -> v - 2);
		estoque.merge("Melao", 5, (k,v) -> v - 3);
		estoque.merge("Coca-Cola", 10, (k,v) -> v - 9);
		System.out.println(estoque);
		
	}
}
