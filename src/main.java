import rxtxrobot.*;

public class main {
	
	
	public static void main()
	{
	//Create a new Arduino Object
	RXTXRobot master = new ArduinoNano(); 
	
	// Set port to COM3 for the first Arduino
	master.setPort("COM3");
	
	//Connect to Master
	master.connect();
	
	
	}
	
	
}
