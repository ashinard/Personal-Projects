import java.util.*;
public class d10 implements Dice 
{
    private int current;
    private int total;
    private int rolling;
    private int count = 0;
    Scanner amount = new Scanner(System.in);
    Random rnjesus = new Random();

    public int roll()
    {
        this.total = 0;
        System.out.println("How many we rolling?");
        this.rolling = amount.nextInt();
        System.out.println("Individual rolls:");

        if(this.rolling == 0) this.total = 0;
        if(this.rolling == 1) this.total = rnjesus.nextInt(10) + 1;
        if(this.rolling >= 2)
        {
            while(this.count < this.rolling)
            {
                this.current = rnjesus.nextInt(10) + 1;
                this.total += this.current;
                System.out.println(this.current);
                this.count++;
            }
        }

        this.count = 0;
        System.out.println("Total: ");
        return this.total;
    }
}