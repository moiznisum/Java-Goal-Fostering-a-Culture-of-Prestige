import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConcurrentMapExample {

    public static void main(String[] args) {

        Map<String, Integer> map = new ConcurrentHashMap<>();

        map.put("A", 1);
        map.computeIfPresent("A", (k, v) -> v + 1);

        System.out.println(map);
    }
}
