import java.util.*;
public class diceBag 
{
    public static void main(String[] args) 
    {
        int x = 0;
        d4 four = new d4();
        d6 six = new d6();
        d8 eight = new d8();
        d10 ten = new d10();
        d12 twelve = new d12();
        d20 twenty = new d20();
        percentile hundred = new percentile();
        Scanner which = new Scanner(System.in);

        Dice.display();

        while(true)
        {
            x = which.nextInt();

            switch(x)
            {
                case 1: System.out.println(four.roll());
                        break;
                case 2: System.out.println(six.roll());
                        break;
                case 3: System.out.println(eight.roll());
                        break;
                case 4: System.out.println(ten.roll());
                        break;
                case 5: System.out.println(twelve.roll());
                        break;
                case 6: twenty.roll();
                        break;
                case 7: System.out.println(hundred.roll());
                        break;
                case 0: which.close();
                        System.exit(0);
                default:System.out.println("Pick a real option.");
            }

            Dice.display();
        }
    }
}

