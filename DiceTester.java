package assignment2;


public class ruiz_sammuel {

    public static void main(String[] args) {

        //declare new array called occurrences
        int[] occurrences = new int[13];
        //new dice object
        Dice dice = new Dice();
        
        // A for loop to roll the dice 1000 times
        for(int i = 0; i <= 1000 ; i++){
        
        // Roll both dice
        dice.roll();
        
        // Get the sum of the face values of the two dice
        int total = dice.getFaceValue();
        occurrences[total]++;
        }

        // A for loop to print all occurences 
        for(int i = 2; i<=12; i++){
            System.out.println("Number of " + i + "'s " + occurrences[i]);

        }
        
        //Calling the historam method into this main class
        histogram(occurrences);







    }

    // A method for the histogram to be called in the main class

    public static void histogram(int[] occurrences){
        System.out.println("Graph");
        // for loop to print the y axis
        for(int y = 175; y >= 0; y -=25){
            String line = String.format("%3d|", y)  ;
            
            for(int i = 2; i <=12; i++){
                if( occurrences[i] >= y){
                    line += " * ";
                } else {
                    line += "   ";
                }
            }
            System.out.println(line);
        }


        //prints out the x-axis
        System.out.println("    ----------------------------------");
        System.out.println( "     2  3  4  5  6  7  8  9  10 11 12");
    }





}
