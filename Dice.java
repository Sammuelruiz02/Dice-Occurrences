package assignment2;
public class Dice {
    // Declare two private Die objects
    private Die die1;
    private Die die2;

    // Constructor that initializes both dice with a default face value of 1
    public Dice() {
        die1 = new Die();  // First die
        die2 = new Die();  // Second die
    }

    // Method to roll both dice
    public void roll() {
        die1.roll();  // Roll first die
        die2.roll();  // Roll second die
    }

    // Method to get the sum of the face values of both dice
    public int getFaceValue() {
        return die1.getFaceValue() + die2.getFaceValue();
    }
}

