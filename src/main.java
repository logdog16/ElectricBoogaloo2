import rxtxrobot.*;

public class main {
	
	
	public static void main()
	{
	//Create a new Arduino Object
	RXTXRobot master = new ArduinoNano(); 
	
	RXTXRobot slave = new ArduinoNano();
	
	// Set port to COM3 for the first Arduino
	master.setPort("COM3");
	slave.setPort("COM5");
	
	//Connect to Master
	master.connect();
	slave.connect();
		for(int x = 0; x <= 300; x++){
		 
			if(x < 100){
				master.runMotor(RXTXRobot.MOTOR1, 100, RXTXRobot.MOTOR2, 100, 0);
			}else if( x == 100){
				slave.runMotor(RXTXRobot.MOTOR1, 100, 20);
			}else{
				System.out.print("Some Crazy Stuff Has Happend to get here!");
			}
			
		}
	
	
	}
	
	
}
