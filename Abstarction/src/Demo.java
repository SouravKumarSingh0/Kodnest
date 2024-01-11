
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StudentActivity a = new StudentActivity();
		/*CivilStudent civil = new CivilStudent();
		civil.study();
		
		
		ComputerScience cs = new ComputerScience();
		cs.study();*/
		StudentActivity s;
		s = new CivilStudent();
		s.study();
		s.sleep();
		
		s = new ComputerScience();
		s.study();
		s.sleep();

	}

}
