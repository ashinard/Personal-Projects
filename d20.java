import java.util.*;
public class d20 implements Dice 
{
    private int current;
    private String decision;
    private int count;
    private final int TWICE = 2;

    Random rng = new Random();
    Scanner choice = new Scanner(System.in);

    public int roll()
    {
        System.out.println("Is there advantage?");
        System.out.println("Yes or No.");
        this.decision = choice.next();

        if(this.decision.equalsIgnoreCase("yes"))
        {
            System.out.println("Your rolls:");

            while(this.count < TWICE)
            {
                System.out.println(rng.nextInt(20) + 1);
                this.count++;
            }

        }
        else if(this.decision.equalsIgnoreCase("no"))
        {
            System.out.println("Your roll:");
            System.out.println(rng.nextInt(20) + 1);
        }
        else
        {
            System.out.println("This was a simple yes or no question.");
            System.out.println("Nat 1 for you!");
            this.current = 1;
            System.out.println(this.current);
        }

        return 0;
    }
}
