import java.lang.reflect.Method;

class Calculator {
    // defining a private method for internal calculation
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class PrivateMethodInvoke {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        // searching for the private method with specific parameter types
        Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        
        // enabling access to the private method
        method.setAccessible(true);
        
        // invoking the method and storing the result
        Object result = method.invoke(calc, 10, 5);
        System.out.println("Multiplication Result: " + result);
    }
}