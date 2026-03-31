public class LegacyAPI {
    // deprecating the old method to warn developers
    @Deprecated
    public void oldFeature() {
        System.out.println("Old Feature: Use this at your own risk!");
    }

    // providing a better alternative
    public void newFeature() {
        System.out.println("New Feature: Faster and safer.");
    }

    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        // calling deprecated method (will show a warning in IDE)
        api.oldFeature();
        // calling the new recommended method
        api.newFeature();
    }
}