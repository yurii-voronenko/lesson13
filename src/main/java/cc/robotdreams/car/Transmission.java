package cc.robotdreams.car;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

final public class Transmission
{
    final private Map<String, Function> hooks = new HashMap<>();

    Transmission() {}

    void addHook(String name, Function hook) {
        this.hooks.put(name, hook);
    }

    public void setDrive() {
        if (hooks.containsKey("setDrive"))
            hooks.get("setDrive").apply(this);
        /* ... */
    }
}
