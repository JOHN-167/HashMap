import java.io.*;
import java.util.*;

public class IOPractice {

    public static void main (String[] args) {
        try {
            File file = new File("TextFile.txt");
            Scanner scan = new Scanner(file);
            FileWriter newFile = new FileWriter("NewFile.txt");
            while (scan.hasNextLine()) {
                // System.out.println(scan.nextLine());
                newFile.write(scan.nextLine()+"\n");
            }
            newFile.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}