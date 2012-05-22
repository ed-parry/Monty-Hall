import java.util.Random;

public class MontyHall {
	
	private static double result;
	private boolean willSwitch;
	
	public static void main(String[] args)
	{
		int iterations = Integer.parseInt(args[0]);
		int ifSwitch = Integer.parseInt(args[1]);
		
		if(ifSwitch == 1)
		{
				compute(iterations, true);
		}
		else if(ifSwitch == 0)
		{
			compute(iterations, false);
		}
		
		System.out.println("Probability: " + result);
	}
	
	public static double compute(double iterate, boolean willSwitch)
	{
		double count = 0;
		for(int i=0; i<iterate; i++)
		{
			Random random = new Random();
			int car = random.nextInt(3)+1;
			int guess = random.nextInt(3)+1;
			
			// if the guess wasn't correct and the user switched
			if(car != guess && willSwitch == true)
			{
				count++;
			}
			
			// if the guess was correct and the user didn't switch
			else if(car == guess && willSwitch == false)
			{
				count++;
			}
		}
		
		result = count / iterate;
		return result;
	}
}