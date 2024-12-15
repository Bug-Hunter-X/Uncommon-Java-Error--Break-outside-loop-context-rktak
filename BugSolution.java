The solution is simply to ensure that the 'break' statement is always placed inside a loop or switch statement.  If you need to terminate execution of a larger block of code, consider using exceptions or conditional statements instead. 

 public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("Iteration: " + i);
            if (i == 5) {
                break; // Correct usage: inside a loop
            }
            i++;
        }
        System.out.println("Loop finished");
    }
} 