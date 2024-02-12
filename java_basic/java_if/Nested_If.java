public class Nested_If {
    public static void main(String[] args) {
        
        // Assuming 'rating' is the variable representing the user's feedback rating (between 0 and 5)
        int rating = 1;

        // Check if the 'rating' is within the valid range (0 to 5)
        if(rating >= 0 && rating <= 5) {

            // If 'rating' is less than or equal to 2, ask for the reason for the low rating
            if (rating <= 2) {
                System.out.println("What's the reason for your low rating?");
            }

            // Regardless of the rating, express gratitude for the feedback
            System.out.println("Thank you for your feedback.");
        }
    }
}
