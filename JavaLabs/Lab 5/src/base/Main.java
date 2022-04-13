package base;


public class Main {
    /**
     * In our Assignment here we're running a little lemonade stand and we also sell pretzels. We need to keep track of
     * our inventory as well as the money that we're making throughout the day. I have code in the wet code section that
     * keeps track of all of this poorly. Come up with a better way to manage our system. There's not just one way to do
     * this so get creative and most importantly remember to stay DRY!
     *
     * We're gonna look at the first hour where we have 15 customers!
     *
     * We're responsible for keeping track of the number of pretzels and lemonades sold as well as the cash on hand and
     * in the tip jar! To keep things easy I won't make you make change! At the end of the day tips are split among the
     * employees! That means DON'T add it to the cash at the end of the day or during a transaction
     *
     * At the end we're going to print out our inventory left and how much we made in case for the day! Print out the
     * tips too!
     *
     * Remember to use functions, variables, and whatever else would make this easier to maintain!
     *
     * Pretzels are $2 for 1
     * Lemonade is $8 for 1
     */
    static int lemonadesAvailable = 43;
    static int pretzelsAvailable = 60;
    static double cash = 1500.0;
    static double tips = 0.0;


    public static void main(String[] args) {
        //	Replace this with your dry inventory function!
        dryInventory();
    }

    static void dryInventory() {
        /**create arrays for each component
         * loop through each array to come up with totals
         */
      int[] lemonade = {1, 3, 2, 6, 4, 8, 1, 7, 3, 2,0,0,0,0,0,0,0,0,0,0};
      int[] pretzels = {4, 2, 3, 1, 2, 10, 6, 1, 2, 6, 9,0,0,0,0,0,0,0,0,0};
      double[] money = {8, 4, 24, 6, 2, 16, 48, 32, 4, 20, 64, 12, 8, 2, 56, 4, 12, 24, 18, 16};
      double[] jar = {4, 10, 5, 10, 4, 3,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

      for (int i=0; i<lemonade.length; i++){
        lemonadesAvailable = lemonadesAvailable - lemonade[i];
        pretzelsAvailable = pretzelsAvailable - pretzels[i];
        cash = cash + money[i];
        tips = tips + jar[i];
        }
        
        System.out.println("Results for the hour!");
        System.out.println("Lemonades Inventory: " + lemonadesAvailable);
        System.out.println("Pretzels Inventory: " + pretzelsAvailable);
        System.out.println("Cash: $" + cash);
        System.out.println("Tips: $" + tips);
    }

    static void wetInventory() {
        /**
         * We have 10 customers in the first hour! This is what they bought! When running this with your dry code you
         * don't want to run this function because then the numbers in the end will be wrong!
         */
        //Customer 1
        pretzelsAvailable -= 4;
        cash += 8;
        lemonadesAvailable -= 1;
        cash += 8;
        tips += 4;

        //Customer 2
        pretzelsAvailable -= 2;
        cash += 4;
        lemonadesAvailable -= 3;
        cash += 24;

        //Customer 3
        pretzelsAvailable -= 3;
        cash += 6;

        //Customer 4
        pretzelsAvailable -= 1;
        cash += 2;
        lemonadesAvailable -= 2;
        cash += 16;

        //Customer 5
        lemonadesAvailable -= 6;
        cash += 48;
        tips += 10;

        //Customer 6
        lemonadesAvailable -= 4;
        cash += 32;
        tips += 5;

        //Customer 7
        pretzelsAvailable -= 2;
        cash += 4;

        //Customer 8
        pretzelsAvailable -= 10;
        cash += 20;
        lemonadesAvailable -= 8;
        cash += 64;
        tips += 10;


        //Customer 9
        pretzelsAvailable -= 6;
        cash += 12;

        //Customer 10
        lemonadesAvailable -= 1;
        cash += 8;

        //Customer 11
        pretzelsAvailable -= 1;
        cash += 2;

        //Customer 12
        lemonadesAvailable -= 7;
        cash += 56;
        tips += 4;

        //Customer 13
        pretzelsAvailable -= 2;
        cash += 4;

        //Customer 14
        pretzelsAvailable -= 6;
        cash += 12;
        lemonadesAvailable -= 3;
        cash += 24;

        //Customer 15
        pretzelsAvailable -= 9;
        cash += 18;
        lemonadesAvailable -= 2;
        cash += 16;
        tips += 3;

        System.out.println("Results for the hour!");
        System.out.println("Lemonades Inventory: " + lemonadesAvailable);
        System.out.println("Pretzels Inventory: " + pretzelsAvailable);
        System.out.println("Cash: " + cash);
        System.out.println("Tips: " + tips);
    }
}
