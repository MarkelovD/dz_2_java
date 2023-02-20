import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class dz_2 {

    public static void main(String[] args) throws FileNotFoundException{
        WriteFile();
    }
    
    static int PowNums(int args[]){
        int  result = 1;
        int deg = args[1];
        int num = args[0];
        while(deg!=0) {
            if (deg % 2 == 0) {
                deg /= 2;
                num *= num;
            }
            else {
                deg--;
                result *= num;
            }
        }
        return result;
    }

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
    static void WriteFile() throws FileNotFoundException{
        String result = Integer.toString(PowNums(ReadFile()));
        try (FileWriter writer = new FileWriter("output.txt",false)){
            writer.write(result);
            writer.flush(); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }
}