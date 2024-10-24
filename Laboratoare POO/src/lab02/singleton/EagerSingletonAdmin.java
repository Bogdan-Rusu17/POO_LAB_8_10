package lab02.singleton;

import java.util.ArrayList;
import java.util.List;

public class EagerSingletonAdmin {
    private static EagerSingletonAdmin instance = new EagerSingletonAdmin();
    private List<String> commands = new ArrayList<>();

    private EagerSingletonAdmin() {}

    public static EagerSingletonAdmin getInstance() {
        return instance;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    @Override
    public String toString() {
        return "EagerSingletonAdmin{" +
                "commands=" + commands +
                '}';
    }
}
