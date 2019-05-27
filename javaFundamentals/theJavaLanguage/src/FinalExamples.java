import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FinalExamples {
    private final List<Integer> items = new ArrayList<>();
    private int totalWeight = 0;

    public void add(Integer i) {
        items.add(i);
        totalWeight += i;
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }

    public static void main(String[] args) {
        FinalExamples fe = new FinalExamples();
        fe.add(0);
    }
}
