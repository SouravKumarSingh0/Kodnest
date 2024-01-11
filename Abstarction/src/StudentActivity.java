
interface StudentActivity {
	
	static final int value = 20;
	void study();
	abstract void sleep();
	void eat();
	
}

 class CivilStudent implements StudentActivity{

	void display() {
		System.out.println(value);
	}
	
}
 
 class ComputerScience implements StudentActivity{

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("cs Studying1");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("cs Sleeping1");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("cs Eating");
		
	}
	 
 }
