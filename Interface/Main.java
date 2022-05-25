
public class Main
{
	public static void main(String[] args) {
		Car new_car= new Car("abc","123 km/hr","xyz","loc_ABC");
		System.out.println(new_car.getType());
		System.out.println(new_car.getSpeed());
		System.out.println(new_car.getColor());
		System.out.println(new_car.getLocation());
	}
}

