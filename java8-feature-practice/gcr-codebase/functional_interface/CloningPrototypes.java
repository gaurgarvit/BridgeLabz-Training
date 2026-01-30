class Robot implements Cloneable {
    String id;

    Robot(String id) {
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningPrototypes {
    public static void main(String[] args) {
        try {
            Robot r1 = new Robot("R-101");
            Robot r2 = (Robot) r1.clone(); // Cloning enabled by marker interface
            
            System.out.println("Original Robot ID: " + r1.id);
            System.out.println("Cloned Robot ID: " + r2.id);
        } 
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}