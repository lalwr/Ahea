import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JAVA9_collection {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list = Collections.unmodifiableList(list);


    }
}
