public class UncommonBug {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[5] = 10; // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
            //Re-throw the exception to be handled elsewhere
            throw e; 
        }
    }
}