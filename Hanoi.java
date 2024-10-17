// Hanoi.java
public class Hanoi {

    // Recursive method for Towers of Hanoi problem
    public static void towers(int start, int end, int number) {
        // Base case: when there is only one disk
        if (number == 1) {
            System.out.println("Move disk #1 from pole " + start + " to pole " + end);
        } else {
            // The auxiliary pole is the one that is not start or end
            int other = 6 - start - end;

            // Move (number-1) disks from start to the auxiliary pole
            towers(start, other, number - 1);

            // Move the nth (largest) disk directly from start to end
            System.out.println("Move disk #" + number + " from pole " + start + " to pole " + end);

            // Move the (number-1) disks from auxiliary pole to end
            towers(other, end, number - 1);
        }
    }

    // Main method to call the towers method
    public static void main(String[] args) {
        towers(1, 3, 4);  // Call with 4 disks from pole 1 to pole 3
    }
}