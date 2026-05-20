package OOPsConcepts;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW B=new BMW();
		B.start();
		B.stop();
		B.TheftSafety();
		B.handBrake();
		
		Car c=new BMW();  //top casting.; run time polymorphisim
		c.start();
		c.stop();
		c.handBrake();
		

	}

}

