package dicetester;
import java.util.Random;


public class Die {
    // Private variable to hold the current face value of the die
    private int faceValue;

    // No-argument constructor to initialize faceValue to 1
    public Die() {
        this.faceValue = 1;
    }

    // Method to roll the die and set a random face value (1 to 6)
    public void roll() {
        Random random = new Random();
        faceValue = random.nextInt(6) + 1;  // Random number between 1 and 6
    }

    // Method to get the current face value of the die
    public int getFaceValue() {
        return faceValue;
    }
}
