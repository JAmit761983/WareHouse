import com.creational.factory.OS;
import com.creational.factory.OperatingSystemFactory;

// Factory Pattern - Creational Design Pattern


public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getInstance("Open");
		obj.spec();

	}

}
