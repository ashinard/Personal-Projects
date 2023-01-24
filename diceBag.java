import java.util.Random;
public class diceBag 
{

    int total;
    int currentRoll;
    Random rng = new Random();

    public int d4(int x)
    {
        System.out.println("Results:");
        total = 0;
        for(int i = 0; i < x; i++)
        {
            currentRoll = rng.nextInt(4) + 1;
            System.out.println(currentRoll);
            total += currentRoll;
        }
        return total;
    }
    
    public int d6(int x)
    {
        System.out.println("Results:");
        total = 0;
        for(int i = 0; i < x; i++)
        {
            currentRoll = rng.nextInt(6) + 1;
            System.out.println(currentRoll);
            total += currentRoll;
        }
        return total;
    }
    
    public int d8(int x)
    {
        System.out.println("Results:");
        total = 0;
        for(int i = 0; i < x; i++)
        {
            currentRoll = rng.nextInt(8) + 1;
            System.out.println(currentRoll);
            total += currentRoll;
        }
        return total;
    }

    public int d10(int x)
    {
        System.out.println("Results:");
        total = 0;
        for(int i = 0; i < x; i++)
        {
            currentRoll = rng.nextInt(10) + 1;
            System.out.println(currentRoll);
            total += currentRoll;
        }
        return total;
    }
    
    public int d12(int x)
    {
        System.out.println("Results:");
        total = 0;
        for(int i = 0; i < x; i++)
        {
            currentRoll = rng.nextInt(12) + 1;
            System.out.println(currentRoll);
            total += currentRoll;
        }
        return 0;
    }

    public int d20(int x)
    {
        System.out.println("Results:");
        for(int i = 0; i < x; i++)
        {
            currentRoll = rng.nextInt(20) + 1;
            System.out.println(currentRoll);
        }
        return x;
    }
    
    public int percentile()
    {
        total = rng.nextInt(9) * 10;
        System.out.println(total);
        return total;
    }
}
