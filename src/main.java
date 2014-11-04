import rxtxrobot.*;

public class main {
	
	final private static int PING_PIN = 7; 
	
	 public static void main(String[] args)
	{
	//Create a new Arduino Object
	RXTXRobot r1 = new ArduinoNano(); 	
	RXTXRobot r2 = new ArduinoNano();
	
	//Set port to COM3 for the first Arduino
	r1.setPort("COM3");
	r2.setPort("COM4");
	
	//Connect to Master
	r1.connect();
	r2.connect();
	for (int x=0; x < 100; ++x) 
	{ 
		//Read the ping sensor value, which is connected to pin 12 
		System.out.println("Response: " + r1.getPing(PING_PIN) + " cm"); 
		
		if( r1.getPing(PING_PIN) > 40){
			
			r1.runMotor(RXTXRobot.MOTOR1, 100, RXTXRobot.MOTOR2, 100, 0);
			//System.out.println("Response: " + r1.getPing(PING_PIN) + " cm");
			
		}else if( r1.getPing(PING_PIN) < 40){
			r1.runEncodedMotor(RXTXRobot.MOTOR1, 0, 0, RXTXRobot.MOTOR2, 0, 0);
			r2.runMotor(RXTXRobot.MOTOR1, -25, 200);
			 
			
		}
		
	} 
	//r1.close();
	//r2.close();
	
	
	}
	public double SalintyTest(RXTXRobot r2){
		double  salinityConstant;
		double	salinity;
		int valueBall;
		salinityConstant =  (r2.getConductivity() * 13.55);
		
		salinity = salinityConstant * r2.getConductivity();
		
		
		
		return 0;
		 
		 
	 }
	
	public double SalinityFigure(){
		int bigValue;
		int smallValue; 
		
	for(int x = 0; x < 100; x++){
		
		
		
	}
		
		
		return 0;
		
		
		
	
	}
	
	 
}
