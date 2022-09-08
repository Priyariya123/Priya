package com.bct.java8features.methodreferences;

import java.util.function.BiFunction;

interface MyInterface{
	//a method ---abstact method
	public void display();
}
	//make reference to the abstract method and instance method.
	//1. method reference to an instance method of an object-object::instanceMethod
	//2.method reference to static method of the class.
	

class Addition{
	static int add(int num1,int num2) {
		return num1+num2;//we can use System.out.println("sum"+num1+num2);	
}
}

public class Student {
	//method references is the short hand notation of lambda expression to call a method.
	//str->System.out.println(str);
	//System.out::println
	public void myMethod() {
		System.out.println("Instance Method");
		System.out.println("I have been reference by the abstract");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object to class-student
		Student object=new Student();
		//method reference using the object of the class
		MyInterface ref=object::myMethod;
		//calling the method of functional interface
		ref.display();
		//create an object to class addition
		BiFunction<Integer,Integer,Integer>addition=Addition::add;
		int sum=addition.apply(11, 5);
		System.out.println("Addition:"+sum);
		

	}

}
