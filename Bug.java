public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("Iteration: " + i);
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            i++;
        }
        System.out.println("Loop finished");

        //Uncommon error: Using break without a loop context leads to compile time error
        //if (i == 5) {
        //    break;
        //}        
    }
}