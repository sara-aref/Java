import java.util.ArrayList;
import java.util.List;


public class mainShape {
    public static void main(String [] args) {
    
    	Test tester = new Test();
    	
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());

        tester.testShapes(rectangles);

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle());
        circles.add(new Circle());

        tester.testShapes(circles);
    }
}

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {

	@Override
	void draw ()
	{
		System.out.println("Draw Rectangle");
	}
}

class Circle extends Shape {

	@Override
	void draw ()
	{
		System.out.println("Draw Circle");
	}
}

class Test {
	public void testShapes (List<? extends Shape> shape) {
		for(Shape obj : shape )
		{
			obj.draw();
		}
	}
}

