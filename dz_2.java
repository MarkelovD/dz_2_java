import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class dz_2 {

    static int[] ReadFile() throws FileNotFoundException{ 
        int [] array= new int [2];
        int i = 0;
        FileReader fr = new FileReader("input.txt");
        try (Scanner scan = new Scanner(fr)) {
            while (scan.hasNextLine()) {
                array[i++] = scan.nextInt();
    }
        }
        return array;
    }
}