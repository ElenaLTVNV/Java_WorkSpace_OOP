package sample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product1 = new Product(4000, "Lithomy Steamer for Clothes,1500W", 1.4 );
        Product product2 = new Product(8000, "PHILIPS Easy Touch GC487/86", 4.8);

        System.out.println("Product information 1:");
        product1.displayProductInfo();

        System.out.println("Product information 2:");
        product2.displayProductInfo();
        
        
        Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
        Triangle triangle2 = new Triangle(5.0, 5.0, 5.0);
        Triangle triangle3 = new Triangle(7.0, 24.0, 25.0);

        System.out.println("Area of ​​a triangle 1: " + triangle1.calculateArea());
        System.out.println("Area of ​​a triangle 2: " + triangle2.calculateArea());
        System.out.println("Area of ​​a triangle 3: " + triangle3.calculateArea());
    }
	}


