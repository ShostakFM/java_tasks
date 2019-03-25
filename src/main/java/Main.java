import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "src/files/str.txt";
        FileReader reader = new FileReader(filePath);
        Scanner scanner = new Scanner(reader);
        String str = scanner.nextLine();
        System.out.println(str);
        ArrayList<Character> array = new ArrayList<Character>();
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i< str.length(); i++) {
            set.add(str.charAt(i));
        }
        array.addAll(set);
        Statistics statistics = new Statistics(str, array);
        StatisticsDao statisticsDao = new StatisticsDao();
        statisticsDao.insert(statistics);
        reader.close();
    }
}
