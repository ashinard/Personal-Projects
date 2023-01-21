package Dice;
import java.util.Scanner;
public class roller 
{

	public static void main(String[] args) 
	{
		int die;
		int amount;
		int totalRoll;
		dungeonDice lucky = new dungeonDice();

		Scanner rolling = new Scanner(System.in);
		
		System.out.println("What sided die are you rolling?");
		die = rolling.nextInt();
		
		System.out.println("How many dice are you rolling");
		amount = rolling.nextInt();
		System.out.println("Results:");
		
		totalRoll = lucky.roll(die, amount);
		System.out.println(totalRoll);
		rolling.close();
	}
}
