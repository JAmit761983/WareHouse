import com.structural.adapter.AssignmentWork;
import com.structural.adapter.Pen;
import com.structural.adapter.PenAdapter;

public class School_Adap_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("I am bit Tired to write an assignment");
		
	}

}
