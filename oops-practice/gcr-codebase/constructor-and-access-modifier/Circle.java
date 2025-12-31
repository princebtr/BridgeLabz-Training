//Problem Statement: Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.

class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1.area());
		
		Circle c2 = new Circle(5);
		System.out.println(c2.area());

	}

}
