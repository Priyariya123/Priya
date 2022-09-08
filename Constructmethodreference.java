package com.bct.java8features.methodreferences;
//@functional interface
interface ConstructorInterface{
	Hello display(String say);
}
class Hello{
	Hello(String say) {
		System.out.println("Good morning! "+say);

	}
}

public class Constructmethodreference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorInterface ref=Hello::new;
		ref.display("How are you");

	}

}
