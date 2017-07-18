package abstract;

import java.util.Scanner;

public class assig {

public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the radius of the Circle in cm");
		double radius=scanner.nextDouble();
		
		Circle circle=new Circle();
		circle.setDim1(radius);
		circle.findArea();
		circle.findPerimeter();
		
		Rectangle rectangle=new Rectangle();
		System.out.println("Please enter the length of the rectangle");
		rectangle.setDim1(scanner.nextDouble());
		
		System.out.println("Please enter the breadth of the rectangle");
		rectangle.setDim2(scanner.nextDouble());
		rectangle.findArea();
		rectangle.findPerimeter();
		
		Triangle triangle=new Triangle();
		System.out.println("Please enter the length of first side of the triangle");
		triangle.setDim1(scanner.nextDouble());
		System.out.println("Please enter the length of second side of the triangle");
		triangle.setDim2(scanner.nextDouble());
		System.out.println("Please enter the length of third side of the triangle");
		triangle.setDim3(scanner.nextDouble());
		
		triangle.findArea();
		triangle.findPerimeter();
	}
}

abstract class Figure{
	private double dim1,dim2,dim3;
	
	
	public double getDim3() {
		return dim3;
	}
	public void setDim3(double dim3) {
		this.dim3 = dim3;
	}
	public double getDim2() {
		return dim2;
	}
	public void setDim2(double dim2) {
		this.dim2 = dim2;
	}
	public double getDim1() {
		return dim1;
	}
	public void setDim1(double dim1) {
		this.dim1 = dim1;
	}
	abstract void findArea();
	abstract void findPerimeter();
}

class Circle extends Figure{

	void findArea() {
		// TODO Auto-generated method stub
		
		System.out.println("The area of the circle is "+3.14*getDim1()*getDim1());
	}

	void findPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("The perimeter of the circle is "+2*3.14*getDim1()+"\n");
	}
	
	
}

class Rectangle extends Figure{


	void findArea() {
		// TODO Auto-generated method stub
		
		System.out.println("The area of the Rectangle is "+getDim1()*getDim1());
		
	}

	void findPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("The perimeter of the Rectangle is "+2*(getDim1()+getDim2())+"\n");
		
	}
	
}

class Triangle extends Figure{

	void findArea() {
		// TODO Auto-generated method stub
		float s=(float) ((getDim1()+getDim2()+getDim3())/3);
		float area=(float) Math.sqrt((s*(s-getDim1())*(s-getDim2())*(s-getDim3())));
		System.out.println("The area of the triangle is "+area);
	}


	void findPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("The perimeter of the triangle is "+(getDim1()+getDim2()+getDim3())+"\n");
		
		
	}
	
}
