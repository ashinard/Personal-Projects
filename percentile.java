import java.util.*;
public class percentile implements Dice 
{
    private int total;
    Random rng = new Random();

    public int roll()
    {
        System.out.println("Danger Table Roll:");
        this.total = (rng.nextInt(10) * 10) + (rng.nextInt(10) + 1);

        return this.total;
    }
}