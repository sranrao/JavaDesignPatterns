package sranrao.java.examples.javaDesignPatterns;

public class FactoryDesignPatternMainClass {

	public static void main(String[] args) {
		String objectType = "LexusCar";

		FactoryCarInterface factoryCar = getObjectByType(objectType);
		if (factoryCar != null) {
			String carModel = factoryCar.getCarModel();
			System.out.println("carModel=" + carModel);
		}
	}

	private static FactoryCarInterface getObjectByType(String objectType) {

		switch (objectType) {
			case "AudiCar":
				return new FactoryAudiCar();
	
			case "BMWCar":
				return new FactoryBmwCar();
	
			case "LexusCar":
				return new FactoryLexusCar();
				
			default:
				return null;
		}
	}

}
