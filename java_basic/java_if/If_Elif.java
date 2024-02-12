public class If_Elif {
    public static void main(String[] args) {

        // Boolean variables representing the state of traffic lights
        boolean isLightGreen = true;
        boolean isLightYellow = false;

        // Check the traffic light conditions and execute the corresponding block of code
        if (isLightGreen) {
            System.out.println("Green light. Drive!");
        } else if (isLightYellow) {
            System.out.println("Yellow light. Slow down!");
        } else {
            System.out.println("Red light. Stop!");
        }
    }
}
