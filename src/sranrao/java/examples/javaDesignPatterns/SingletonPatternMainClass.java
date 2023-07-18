package sranrao.java.examples.javaDesignPatterns;

public class SingletonPatternMainClass {

	public static void main(String[] args) {
	SingletonPattern firstObject = SingletonPattern.getInstance();
	SingletonPattern secondObject = SingletonPattern.getInstance();
	if(firstObject.hashCode() == secondObject.hashCode()) {
		System.out.println("Both the hashcode are same implemented Singleton Pattern");
	}

	}

}
