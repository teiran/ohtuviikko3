package ohtu.io;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

//@Component
public class StubIO implements IO {

    private List<String> lines;
    private int i;
    private ArrayList<String> prints;
    

    public StubIO(List<String> values) {
        this.lines = values;
        prints = new ArrayList<>();
    }

    @Override
    public void print(String toPrint) {
        prints.add(toPrint);
    }

    @Override
    public int readInt(String prompt) {
        print(prompt);
        return Integer.parseInt(lines.get(i++));
    }

    public ArrayList<String> getPrints() {
        return prints;
    }

    @Override
    public String readLine(String prompt) {
        print(prompt);
        if (i < lines.size()) {
            return lines.get(i++);
        }
        return "";
    }
}
