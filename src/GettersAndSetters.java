public class GettersAndSetters {
	public static void main(String[] args) {
		// Encapsulation = 	attributes of a class will be hidden or private, 

		//					Can be accessed only through methods (getters & setters)

		//					You should make attributes private if you don't have a reason to make them public/protected
		Car car = new Car("Chevrolet","Camaro",2021);
		car.setYear(2022);
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
        
        // normal copy
        Car car2 = new Car("Ford","Mustang",2020);
        car2.copy(car);

        // copy using constructor
        Car car3 = new Car(car);
        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());
	}
}

class Car {
	private String make;
	private String model;
	private int year;

	Car(String make,String model,int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}

	public String getMake() {
		return this.make;
	}

	public String getModel() {
		return this.model;
	}

	public int getYear() {
		return this.year;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

    // copy constructor
    public Car (Car car1) {
        // no need to reuse the code in copy method, just call it
        this.copy(car1); 
    }

    public void copy (Car car1) {
        this.setMake(car1.getMake());
        this.setModel(car1.getModel());
        this.setYear(car1.getYear());
    }
}