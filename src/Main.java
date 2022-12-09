import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import java.util.*;


public class Main {
    public static  void main(String[] args) throws IOException, CsvValidationException {
        List<Subdivision.Person> human; String exit_code;
        CSVparser reader = new CSVparser();
        Scanner in = new Scanner(System.in);
        do { human = reader.fileRead();
            for (int i = 1; i < human.size(); i++)
                System.out.println(human.get(i));
            System.out.println("Enter 'e' to exit.");
            exit_code = in.nextLine();
        } while (!Objects.equals(exit_code, "e"));
    }
}
