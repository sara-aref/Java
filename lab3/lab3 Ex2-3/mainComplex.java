import java.util.ArrayList;
import java.util.List;


public class mainShape {
    public static void main(String [] args) {
    	ComplexNumber<Double> complex1 = new ComplexNumber<>(2.0, 3.0);
        ComplexNumber<Double> complex2 = new ComplexNumber<>(1.0, 2.0);

        ComplexNumber<Double> sum = complex1.add(complex2);
        ComplexNumber<Double> difference = complex1.subtract(complex2);
        ComplexNumber<Double> product = complex1.multiply(complex2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

    }
}

public class ComplexNumber<T extends Number>{
	private T real;
	private T imaginary;
	
	public ComplexNumber(T real, T imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void setReal(T newValue) {
		real = newValue;
	}

	public void setImaginary(T newValue) {
		imaginary = newValue;
	}

	public T getReal() {
		return real;
	}
	public T getImaginary() {
		return imaginary;
	}	
	// Addition
	public ComplexNumber<T> add(ComplexNumber<T> other) {
		T newReal = (T) (Double) (this.real.doubleValue() + other.real.doubleValue());
		T newImaginary = (T) (Double) (this.imaginary.doubleValue() + other.imaginary.doubleValue());
		return new ComplexNumber<>(newReal, newImaginary);
	}

	// Subtraction
	public ComplexNumber<T> subtract(ComplexNumber<T> other) {
		T newReal = (T) (Double) (this.real.doubleValue() - other.real.doubleValue());
		T newImaginary = (T) (Double) (this.imaginary.doubleValue() - other.imaginary.doubleValue());
		return new ComplexNumber<>(newReal, newImaginary);
	}

	// Multiplication
	public ComplexNumber<T> multiply(ComplexNumber<T> other) {
		T newReal = (T) (Double) (this.real.doubleValue() * other.real.doubleValue()
                - this.imaginary.doubleValue() * other.imaginary.doubleValue());
		T newImaginary = (T) (Double) (this.real.doubleValue() * other.imaginary.doubleValue() + this.imaginary.doubleValue() * other.real.doubleValue());
		return new ComplexNumber<>(newReal, newImaginary);
	}

	@Override
	public String toString() {
		return real + " + " + imaginary + "i";
	}
}

