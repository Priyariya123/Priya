package com.bct.java8features.functional.interfaces;
import java.util.function.IntBinaryOperator;
//default interfaces
interface Myinterface{
	default void newMethod() {
	System.out.println("Newly added default method");
	}
	public void existingMethod(String str);
}
//inheritance concept.
class Example implements Myinterface{
	public void existingMethod(String str) {
		System.out.println("the string is:"+str);
	}
	
}

//creating our own functional interface
interface MyFunctionalInterface{
	//single abstract method.
	public int addMethod(int a,int b);
}

public class Functionalinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lambda operation
		MyFunctionalInterface sum=(a,b)->a+b;
		System.out.println("Result = "+sum.addMethod(1000,1234));
		//predefined functional interface
		//lambda expression
		IntBinaryOperator add=(a,b)->a+b;
		System.out.println("Result = "+add.applyAsInt(12,100));
		
		Example instance=new Example();
		instance.newMethod();
		instance.existingMethod("java 8 is not easy to learn");

	}

}
