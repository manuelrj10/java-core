class car{

	//instance varible
	String brand_name;
	String color;
	int mileage;
	int seating_capacity;
	String transmission;
	public static void main(String args[]){
		car c1=new car();
		c1.brand_name="bmw";
		c1.color="black";
		c1.mileage=20;
		c1.seating_capacity=2;
		c1.transmission="automatic";
		
		System.out.println("car details");
		System.out.println( "car 1"); 
		System.out.println("brand name "+c1.brand_name);
		System.out.println("color is:"+c1.color);
		System.out.println("mileage is:"+c1.mileage);
		System.out.println("seating capacity is:"+c1.seating_capacity);
		System.out.println("transmission:"+c1.transmission);
		
		car c2=new car();
		c2.brand_name="audi";
		c2.color="black";
		c2.mileage=16;
		c2.seating_capacity=4;
		c2.transmission="manual";
		
		System.out.println("\n");
		System.out.println( "car 2");
		System.out.println("brand name "+c2.brand_name);
		System.out.println("color is:"+c2.color);
		System.out.println("mileage is:"+c2.mileage);
		System.out.println("seating capacity is:"+c2.seating_capacity);
		System.out.println("transmission:"+c2.transmission);
		
		car c3=new car();
		c3.brand_name="Thar";
		c3.color="black";
		c3.mileage=13;
		c3.seating_capacity=4;
		c3.transmission="manual";
		
		System.out.println("\n");
		System.out.println( "car3");
		System.out.println("brand name "+c3.brand_name);
		System.out.println("color is:"+c3.color);
		System.out.println("mileage is:"+c3.mileage);
		System.out.println("seating capacity is:"+c3.seating_capacity);
		System.out.println("transmission:"+c3.transmission);
		
	}
}
	