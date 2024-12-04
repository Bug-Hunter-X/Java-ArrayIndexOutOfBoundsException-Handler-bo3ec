public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[5] = 10; // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.  Program will continue execution.");
            //Handle the exception here.  Do not re-throw.
        }
    }
}