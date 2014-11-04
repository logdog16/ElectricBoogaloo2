import rxtxrobot.ArduinoNano;
import rxtxrobot.RXTXRobot;

public class main {
	
	
		
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
		//Back To start
		r1.runMotor(RXTXRobot.MOTOR1, -200, RXTXRobot.MOTOR2, -200, 3000);
		
		//Turn right
		r1.runMotor(RXTXRobot.MOTOR1, -100, RXTXRobot.MOTOR2, 100, 0);
		r1.sleep(1000);
		
		
		//Booggie and Wiggle till go balls to the wall
		r1.runMotor(RXTXRobot.MOTOR1, 80, RXTXRobot.MOTOR2, 100, 0);
		r1.sleep(1000);
		r1.runMotor(RXTXRobot.MOTOR1, 100, RXTXRobot.MOTOR2, 80, 0);
		r1.sleep(1000);
		r1.runMotor(RXTXRobot.MOTOR1, 80, RXTXRobot.MOTOR2, 100, 0);
		r1.sleep(1000);
		r1.runMotor(RXTXRobot.MOTOR1, 100, RXTXRobot.MOTOR2, 80, 0);
		r1.sleep(1000);
		r1.runEncodedMotor(RXTXRobot.MOTOR1, 0, 0, RXTXRobot.MOTOR2, 0, 0);
		
		//Pull out!
		r1.runMotor(RXTXRobot.MOTOR1, -100, RXTXRobot.MOTOR2, -100, 0);
		r1.sleep(1000);
		
		
		
		//Turn dat ass around 
		r1.runMotor(RXTXRobot.MOTOR1, -100, RXTXRobot.MOTOR2, 100, 0);
		r1.sleep(2000);

			
		//Booggie and Wiggle till go balls to the wall
		r1.runMotor(RXTXRobot.MOTOR1, 80, RXTXRobot.MOTOR2, 100, 0);
		r1.sleep(1000);
		r1.runMotor(RXTXRobot.MOTOR1, 100, RXTXRobot.MOTOR2, 80, 0);
		r1.sleep(1000);
		r1.runMotor(RXTXRobot.MOTOR1, 80, RXTXRobot.MOTOR2, 100, 0);
		r1.sleep(1000);
		r1.runMotor(RXTXRobot.MOTOR1, 100, RXTXRobot.MOTOR2, 80, 0);
		r1.sleep(1000);
		r1.runEncodedMotor(RXTXRobot.MOTOR1, 0, 0, RXTXRobot.MOTOR2, 0, 0);
			
		//Pull out!
		r1.runMotor(RXTXRobot.MOTOR1, -100, RXTXRobot.MOTOR2, -100, 0);
		r1.sleep(1000);
		
		
		//Go back to start
		r1.runMotor(RXTXRobot.MOTOR1, -100, RXTXRobot.MOTOR2, -100, 0);
		r1.sleep(2000);
		
		//Go Across Bridge (Center)
		r1.runMotor(RXTXRobot.MOTOR1, 500, RXTXRobot.MOTOR2, 500, 0);
		r1.sleep(6000);
		
		//Turn dat ass 
		r1.runMotor(RXTXRobot.MOTOR1, -100, RXTXRobot.MOTOR2, 100, 0);
		r1.sleep(2000);
	//r1.close();
	//r2.close();
		
		
		}

		
		
		
		
}
	
