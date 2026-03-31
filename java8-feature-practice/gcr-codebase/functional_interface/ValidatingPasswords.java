interface SecurityUtils {
    // Static method inside interface
    static boolean checkStrength(String password) {
        return password.length() >= 8 && password.contains("@");
    }
}

public class ValidatingPasswords {
    public static void main(String[] args) {
        String pass = "Code@123";
        
        // Calling static method directly from Interface
        boolean isStrong = SecurityUtils.checkStrength(pass);
        
        System.out.println("Is password strong? " + isStrong);
    }
}