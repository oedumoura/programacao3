package br.cesed.si.p3.exceptions.lista1.temperatura;

public class Utils {
	
	public static double toCelsius(double temperaturaFahrenheit) throws FahrenheitException {
		if (temperaturaFahrenheit < -459.67) {
			throw new FahrenheitException("Temperatura menor que o Zero Absoluto.");
			
		} else {
			double celsius = (5* (temperaturaFahrenheit +32))/9;
			return 	celsius;
		}
	}

}
