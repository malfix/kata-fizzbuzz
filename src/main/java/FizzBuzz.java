/**
 * Created by emalfara on 26/01/16.
 */
public class FizzBuzz {
    private ConfigFizzBuzz config;

    public FizzBuzz(ConfigFizzBuzz config) {
        this.config = config;
    }

    public String getResult(int i) {
        String valueReturned = config.getFizzBuzzFor(i);
        return valueReturned.isEmpty() ? String.valueOf(i) : valueReturned;
    }
}
