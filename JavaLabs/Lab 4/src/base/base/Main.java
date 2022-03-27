// package base;


public class Main {
    /**
     * # Lab Four
     * ---
     *
     * For this lab we're going to be making and using a bunch of functions.
     *
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
   

   
    // For the following todos you'll probably want to define them below and then call them from the main function above.

    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */
    //Start with function takes in two variables
    //then takes the second number and multiplies the first by itself n times
    //then return answer

    public static long power(int x, int y){
        long ans = x;
        for (int i=1; i < y; i++){
            ans = ans * x;
        }
        return ans;
    }



    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */


    /*public static void count(int[] arr, int x){
        int [] store = new int [] {arr.length};
        int visited = -1;
       
        for (int i=0; i<arr.length; i++){
            int count = 1;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    store[j]=visited;
                }
            }
            if(store[i]!=visited){
                store[i]=count;
            }
            
        }
        System.out.println()
    }



    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */


    /*public static int summation(int[] arr){
    int sum = 0;
    for (int i:arr.length){
            sum += i;
        }
        System.out.println(sum);
    }



    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     */


    //int addition(int a, int b) {
    //    return a + b;
    //}

    //int division(int a, int b) {
    //    return a / b;
    //}

   // public static void pytheorem(int a, int b){
     //   double c = Math.sqrt((power(a,2)) + (power(b,2)));
     //   System.out.println("C = " + c);
    //}


public static void main(String[] args) {
    // Give me an example of you using switch case.
    String starter = "Peanut buTTer Chocolate vANILLA swiRRl";

    switch(starter){
        case "Vanilla":
            System.out.println("Basic Vanilla here you go!");
            break;
        case "Chocolate":
            System.out.println("Hershey Drop Supreme is my fave.");
            break;
        default:
            System.out.println("Sorry kiddo, we only have chocolate or vanilla");

    }

    // Give me an example of you using a for loop
    String[] smoothies = {"Strawberry Banana", "Mango Pineapple" , "Pina Colada", "Ginger Lemon"};

    System.out.println("Here are your options today:");
    for (String i : smoothies){
        System.out.println(i);
    }
   
    // Give me an example of you using a while loop
    int i=0;

    while (i<5){
        System.out.println("Woo");
        i++;
    }
    System.out.print(power(2,3));

    //int [] arr = new int[]{5,4,7,7,9,0};

    //count(arr,5);

    //summation(arr);

    //int a = 1;
    //int b = 2;
    //pytheorem(a, b);

    }
}
