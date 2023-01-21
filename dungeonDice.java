package Dice;
import java.util.Random;
public class dungeonDice 
{
	private int count = 0;
	private int currentRoll = 0;
	private int total = 0;
	
	public int roll(int x, int y)
	{
		Random rng = new Random();
		while(count < y)
		{
			currentRoll = rng.nextInt(x) + 1;
			total += currentRoll;
			System.out.println(currentRoll);
			count++;
		}
		
		System.out.println("Total:");
		return total;
	}
}
