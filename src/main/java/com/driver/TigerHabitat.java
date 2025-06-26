import java.util.*;

public class TigerHabitat {
    private List<Tiger> tigers = new ArrayList<>();

    public void addTiger(Tiger tiger) {
        tigers.add(tiger);
    }

    public void listTigers() {
        if (tigers.isEmpty()) {
            System.out.println("No tigers in the habitat.");
        } else {
            System.out.println("Tigers in the Habitat:");
            for (int i = 0; i < tigers.size(); i++) {
                Tiger t = tigers.get(i);
                System.out.printf("%d. Type: %s, Color: %s, Average Weight: %.1f kg, Preferred Climate: %s\n",
                        i + 1, t.getType(), t.getColor(), t.getAverageWeight(), t.getPreferredClimate());
            }
        }
    }

    public void getTigerByType(String type) {
        boolean found = false;
        for (Tiger t : tigers) {
            if (t.getType().equalsIgnoreCase(type)) {
                System.out.println("\nTiger Details:");
                System.out.printf("Type: %s, Color: %s, Average Weight: %.1f kg, Preferred Climate: %s\n",
                        t.getType(), t.getColor(), t.getAverageWeight(), t.getPreferredClimate());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Tiger of this type not found in the habitat.");
        }
    }
}
