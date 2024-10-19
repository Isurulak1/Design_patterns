//structural design pattern
class LegacySystem {
    private String username;
    private int yearsActive;

    public LegacySystem(String username, int yearsActive) {
        this.username = username;
        this.yearsActive = yearsActive;
    }

    public String fetchData() {
        return "username:" + this.username + ",yearsActive:" + this.yearsActive;
    }
}

// Target interface
interface ModernSystem {
    String getUsername();
    int getYearsActive();
}

// Adapter class implementing the ModernSystem interface
class LegacyAdapter implements ModernSystem {
    private LegacySystem legacySystem;

    public LegacyAdapter(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public String getUsername() {
        String data = this.legacySystem.fetchData();
        String username = data.substring(data.indexOf(":") + 1, data.indexOf(","));
        return username;
    }

    @Override
    public int getYearsActive() {
        String data = this.legacySystem.fetchData();
        int yearsActive = Integer.parseInt(data.substring(data.lastIndexOf(":") + 1));
        return yearsActive;
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        LegacySystem user1 = new LegacySystem("lakshan", 5);
        LegacyAdapter adapter1 = new LegacyAdapter(user1);

        System.out.println("Legacy System Data: " + user1.fetchData());
        System.out.println("Adapted Modern System Data: {username: " + adapter1.getUsername() + ", yearsActive: " + adapter1.getYearsActive() + "}");
    }
}


