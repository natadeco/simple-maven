package org.tact.base;

import org.apache.commons.math3.fraction.Fraction;

public class App {

	public static void main(String[] args) {
		System.out.println("Subashini mam is awesome");
		
		int c = MathUtil.add(8, 9);
		System.out.println(c);
		
		int d = MathUtil.subtract(8, 9);
		System.out.println(d);
		
		int e = MathUtil.mult(8, 9);
		System.out.println(e);
	    
		int f = MathUtil.mult(8, 9);
		System.out.println(f);
		
		Fraction obj = new Fraction(10);
		Fraction obj1 = new Fraction(26);
		Fraction sum = obj.add(obj1);		
		
		System.out.println(sum);
	}
	
	
}
