interface Dice 
{
    public int roll();
    public static void display()
    {
        System.out.println("Which one we rolling?");
        System.out.println("1: d4");
        System.out.println("2: d6");
        System.out.println("3: d8");
        System.out.println("4: d10");
        System.out.println("5: d12");
        System.out.println("6: d20");
        System.out.println("7: percentile");
        System.out.println("0: Close");
    }
}
