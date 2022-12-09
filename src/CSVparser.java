
import java.util.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import com.opencsv.CSVReader;
import java.io.IOException;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.commons.io.FilenameUtils;

public class CSVparser {

    private String csvFilePath;

    private boolean correct_input_filepath(String path) {
        File file = new File(path);
        if (file.exists() && FilenameUtils.getExtension(path).equals("csv")) {
            csvFilePath = path;
            return true;
        }   return false;
    }

    private String check_input() {
        Scanner in = new Scanner(System.in);
        String path = "";
        System.out.println("Enter the path: ");
        if (in.hasNextLine()) path = in.nextLine();
        while (!correct_input_filepath(path)) {
            System.out.println("Invalid input. Enter the file path again:");
            if (in.hasNextLine()) path = in.nextLine();
        }
        return path;
    }

    public List<Subdivision.Person> fileRead() throws IOException, CsvValidationException {

        List<Subdivision.Person> human = new ArrayList();

        if (correct_input_filepath(check_input())) {

            FileReader file = new FileReader(csvFilePath);
            CSVReader reader = new CSVReader(file);
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {

                System.out.print(nextLine);
                Random rand = new Random();
                int num = rand.nextInt(9999);
                human.add(new Subdivision.Person(nextLine[0], nextLine[1], nextLine[2], nextLine[5], nextLine[3], nextLine[4], num));
            }
        }
        return human;
    }
}
