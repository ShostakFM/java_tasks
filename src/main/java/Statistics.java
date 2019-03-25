import java.util.ArrayList;
import java.util.Date;

public class Statistics {
    private String input;
    private ArrayList<Character> output;

    public Statistics(String input, ArrayList<Character> output) {
        this.input = input;
        this.output = output;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public ArrayList<Character> getOutput() {
        return output;
    }

    public void setOutput(ArrayList<Character> output) {
        this.output = output;
    }
}
