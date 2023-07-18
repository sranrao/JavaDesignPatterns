package sranrao.java.examples.javaDesignPatterns;

public final class SingletonPattern {
	
	private static SingletonPattern instance = null;
	
	private String name;
	
	private SingletonPattern() {}
	
	public static SingletonPattern getInstance() {
		if (instance == null)
			instance = new SingletonPattern();
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
