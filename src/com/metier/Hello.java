package com.metier;

import com.modele.Student;

public class Hello {

	public static void main(String[] args) {
		Student yo = new Student();
		yo.setName("yo"); 
		yo.setId(4);	
		System.out.println("******* Display ****************");
		System.out.println("Hello boy " + yo.getName() + "  " + yo.getId());
		System.out.println("***********************");
	}
}
