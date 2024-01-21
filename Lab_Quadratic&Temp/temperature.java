import java.util.function.Function;

class temperature {
	public static void main(String args[]) {
	
		Function<Double,Double> fahrenheitTemperature = celsius -> ((celsius*9)/5)+32;  

		
		System.out.println(fahrenheitTemperature.apply(25.0));  

	}
}
