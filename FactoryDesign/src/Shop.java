import com.creational.builder.Phone;
import com.creational.builder.PhoneBuilder;

// Builder Pattern - Creational Design Pattern

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Phone p = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
		System.out.println(p);
		
	}

}
