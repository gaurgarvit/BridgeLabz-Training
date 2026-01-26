import java.util.HashMap;
import java.util.Map;

// defining the functional interface for light behaviors
@FunctionalInterface
interface LightPattern {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {
        
        // initializing the trigger map to hold different behaviors
        Map<String, LightPattern> lightingSystem = new HashMap<>();

        // defining behavior for motion detection using a lambda
        lightingSystem.put("MOTION_DETECTED", () -> {
            System.out.println(">> Trigger: Motion Detected");
            System.out.println("   Action: Turning lights to 100% brightness (Daylight White).");
        });

        // defining behavior for night time mode using a lambda
        lightingSystem.put("NIGHT_TIME", () -> {
            System.out.println(">> Trigger: Time is 10:00 PM");
            System.out.println("   Action: Dimming lights to 20% (Warm Yellow).");
        });

        // defining behavior for a voice command using a lambda
        lightingSystem.put("VOICE_PARTY_MODE", () -> {
            System.out.println(">> Trigger: Voice Command 'Party Mode'");
            System.out.println("   Action: Flashing RGB colors sequentially.");
        });

        // simulating system triggers
        System.out.println("--- Smart Home Simulation ---");
        
        // executing the motion trigger
        lightingSystem.get("MOTION_DETECTED").execute();
        
        System.out.println();
        
        // executing the party mode trigger
        lightingSystem.get("VOICE_PARTY_MODE").execute();
    }
}