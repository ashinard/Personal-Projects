import java.util.Scanner;

public class rollerV2 
{
    public static void main(String[] args)
    {
        Scanner choose = new Scanner(System.in);
        boolean good = true;
        int amount;
        int result;
        diceBag clickClacks = new diceBag();
        String rolling = "";

        while(good)
        {
            System.out.println("Please pick the dice you're rolling then how many or type CLOSE to exit.");
            System.out.println("d4, d6, d8, d10, d12, d20, percentile");
            rolling = choose.next();

            if(rolling.equalsIgnoreCase("d4"))
            {
                amount = choose.nextInt();
                result = clickClacks.d4(amount);
                System.out.println(result);
            }
            else if(rolling.equalsIgnoreCase("d6"))
            {
                amount = choose.nextInt();
                result = clickClacks.d6(amount);
                System.out.println(result);
            }
            else if(rolling.equalsIgnoreCase("d8"))
            {
                amount = choose.nextInt();
                result = clickClacks.d8(amount);
                System.out.println(result);
            }
            else if(rolling.equalsIgnoreCase("d10"))
            {
                amount = choose.nextInt();
                result = clickClacks.d10(amount);
                System.out.println(result);
            }
            else if(rolling.equalsIgnoreCase("d12"))
            {
                amount = choose.nextInt();
                result = clickClacks.d12(amount);
                System.out.println(result);
            }
            else if(rolling.equalsIgnoreCase("d20"))
            {
                amount = choose.nextInt();
                result = clickClacks.d20(amount);
                System.out.println(result);
            }
            else if(rolling.equalsIgnoreCase("percentile"))
            {
                result = clickClacks.percentile();
                result += clickClacks.d10(1);
                System.out.println(result);
            }
            else if(rolling.equalsIgnoreCase("CLOSE"))
            {
                good = false;
                System.exit(0);
            }
            else
            {
                System.out.println("You didn't pick an available option.");
            }
        }
    }    
}
