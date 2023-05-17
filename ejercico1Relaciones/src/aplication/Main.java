package aplication;

import java.util.Iterator;

import entities.Persona;
import service.ServicePersona;

public class Main {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
        for(int i = 0; i < 8; i++) {
        	hashSet.add("banana");
        }
		
        

        
        for (String elemento : hashSet) {
            System.out.println(elemento);
        }
	}

}
