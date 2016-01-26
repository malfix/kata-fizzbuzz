import java.util.HashMap;

public class ConfigFizzBuzz {

    private HashMap<Integer, String> hash = new HashMap();

    public void add(String text, int module) {
        hash.put(module, text);
    }

    public String getFizzBuzzFor(int number) {
        String buildedStr = "";
        for (Integer modulo : hash.keySet()) {
            if (number % modulo == 0) {
                String name = hash.get(modulo);
                buildedStr += (buildedStr.isEmpty()) ? name : capitalize(name);
            }
        }
        return buildedStr;
    }

    private String capitalize(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }
}
