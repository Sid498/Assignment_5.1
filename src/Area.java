import java.util.Scanner;

abstract class Figure {
	double dim1;

	abstract void findArea();

	abstract void findPerimeter();
}

//calculating Area and perimeter of circle
class Circle extends Figure {
	double Area;
	double Perimeter;
	double Pi = 3.14;
	double Radius;

	void findArea() {

		System.out.println("Enter Radius of circle ");
		Scanner sc = new Scanner(System.in);
		Radius = sc.nextInt();
		Area = Pi * Radius * Radius;
		System.out.println("Area of the circle is " + Area);
	}

	void findPerimeter() {
		Perimeter = 2 * Pi * Radius;
		System.out.println("Perimeter of the circle is " + Perimeter);
	}
}
//calculating Area and perimeter of Rectangle
class Rectangle extends Figure {
	double length, width;
	double Area;

	void findArea() {
		System.out.println("Enter the length of Rectangle");
		Scanner sc = new Scanner(System.in);
		length = sc.nextDouble();
		System.out.println("Enter the width of Rectangle");
		width = sc.nextDouble();
		Area = width * length;
		System.out.println("The area of Rectangle is " + Area);
	}

	void findPerimeter() {
		double Perimeter;
		Perimeter = 2 * (length + width);
		System.out.println("The perimeter of Rectangle is " + Perimeter);
	}
}
//calculating Area and perimeter of Triangle
class Triangle extends Figure {
	double Base, Height;
	double Area;

	void findArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base of Triangle ");
		Base = sc.nextDouble();
		System.out.println("Enter Height of Triangle ");
		Height = sc.nextDouble();
		Area = Height * Base / 2;
		System.out.println("The area of Triangle is " + Area);
	}

	void findPerimeter() {
		double Perimeter, SideOne, SideTwo;
		System.out.println("Enter side a of Triangle ");
		Scanner sc = new Scanner(System.in);
		SideOne = sc.nextDouble();
		System.out.println("Enter side b of Triangle ");
		SideTwo = sc.nextDouble();
		Perimeter = SideOne + SideTwo + Base;
		System.out.println("Perimeter of Triangle " + Perimeter);
	}
}

public class Area {

	public static void main(String[] args) {
		char y;
		//getting user input for calculating area
		System.out.println("What you want to do ?");
		System.out.println(
				"Press C for Circle Area" + "\n" + "Press T for Triangle Area" + "\n" + "Press R for Rectangle Area");
		Scanner sc = new Scanner(System.in);
		y = sc.next().toUpperCase().charAt(0);//converting lower case to upper case
		

		switch(y){
		case 'C':
			Circle c = new Circle();
			c.findArea();
			c.findPerimeter();
		case 'R':
			Rectangle r = new Rectangle();
			r.findArea();
			r.findPerimeter();
		case 'T':
			Triangle t = new Triangle();
			t.findArea();
			t.findPerimeter();
		}
	}

}
