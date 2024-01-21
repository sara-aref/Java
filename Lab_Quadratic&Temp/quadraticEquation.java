package Quadra;

import java.util.function.Function;

public class quadraticEquation
{

    static class Coefficients
    {
        double a;
        double b;
        double c;

        public Coefficients(double _a, double _b, double _c)
        {
            a = _a;
            b = _b;
            c = _c;
        }
    }

    public static void main(String[] args) {
        Coefficients coefficients = new Coefficients(1.0, -3.0, 2.0);
        double root1, root2;

        Function<Coefficients, String> calculateRoots = coeffs -> {
            double discriminant = coeffs.b * coeffs.b - 4 * coeffs.a * coeffs.c;

            if (discriminant < 0)
            {
                return ("The quadratic equation has no real roots.");
            }
            else if (discriminant > 0)
            {
            	root1 = (-coeffs.b + Math.sqrt(discriminant)) / (2 * coeffs.a);
                root2 = (-coeffs.b - Math.sqrt(discriminant)) / (2 * coeffs.a);
                return ("The quadratic equation has two real roots: x1 = " + root1 + ", x2 = " + root2);
            }
            else
            {
            	root1 = -coeffs.b / (2 * coeffs.a);
                return ("The quadratic equation has one real root: x = " + root1);
            }

        };

        System.out.println(calculateRoots.apply(coefficients));
        }
}
