package base;

public class Main {
    /**
     * # Lab Three
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {
       // Make an if statement that triggers a print or println statement
        if (true) {
            System.out.print("Pen");
        }

        // Make an if, else statement where the else statement triggers a print or println statement
        boolean Pen = true;
        if (Pen != true){
            System.out.println("Pineapple");
        }else{
            System.out.println("Apple");
        }

        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        Double age = 20.5;
        boolean fake = true;

        if (age >=21){
            System.out.println("Come on in!");
        } else if (fake == true) {
            System.out.println("That was a close one, come in!");
        } else {
            System.out.println("SCRAM!!");
        }

        // Make 2 variables and use them in an if else conditional print from one of the sections
        String weather = "snow";
        if (weather == "sunny"){
            System.out.println("Suns out, bunz out!");
        } else {
            System.out.println("Wear some sort of coat!");    
        }

        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        boolean guilty = true;
        boolean trial = true;

        if (guilty == true && trial == true){
            System.out.println("LIFE SENTENCE! DUN DUN DUUUUUN");
        }

        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        boolean sick = true;
        boolean exposed = true;

        if (sick == true || exposed == true){
            System.out.println("PLeaASE Stay your ass home.");
        }
    }
}
