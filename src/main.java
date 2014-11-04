import rxtxrobot.ArduinoNano;
import rxtxrobot.RXTXRobot;

public class Main {
	
	
		
		final private static int PING_PIN = 7; 
		
	
		 public static void main(String[] args)
		{
		//Create a new Arduino Object
		
		RXTXRobot r1 = new ArduinoNano(); 	
		RXTXRobot r2 = new ArduinoNano();
		
				
		// Set port to COM3 for the first Arduino
				
		r1.setPort("COM3");
		r2.setPort("COM4");
		
		 
		
			
		r1.connect();
		r2.connect();
		
		for (int x=0; x < 100; ++x) 
		{ 
			//Read the ping sensor value, which is connected to pin 12 
			System.out.println("Response: " + r1.getPing(PING_PIN) + " cm"); 
			
			if( r1.getPing(PING_PIN) > 40){
				
				r1.runMotor(RXTXRobot.MOTOR1, 200, RXTXRobot.MOTOR2, 200, 0);
				System.out.println("Response: " + r1.getPing(PING_PIN) + " cm");
				
			}else if( r1.getPing(PING_PIN) < 40){
				r1.runMotor(RXTXRobot.MOTOR1, 0, RXTXRobot.MOTOR2, 0, 0);
				r2.runMotor(RXTXRobot.MOTOR1, -100, 200);
				r2.sleep(5000);
				r2.runMotor(RXTXRobot.MOTOR1, 250, 200);
				break;
				 
				
			}
			
			
					
		} 
		r1.runMotor(RXTXRobot.MOTOR1, 200, RXTXRobot.MOTOR2, 200, 3000);
	//r1.close();
	//r2.close();
		
		
		}

		
		
		
		
}
	
