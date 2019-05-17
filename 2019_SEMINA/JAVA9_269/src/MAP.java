import java.util.Map;

public class MAP {

    public static void main(String[] args) {

        Map<String, Integer> Aheas_VALUE_NULL = Map.of("hyungJin", 30, "minSu", null);


        Map<String, Integer> Aheas_KEY_NULL = Map.of("hyungJin", 30, null, 28);


        Map<String, Integer> Aheas_OVERLAP = Map.of("hyungJin", 30, "hyungJin", 28);


        Map<String, Integer> Aheas = Map.of("hyungJin", 30, "minSu", 28);


    }
}
