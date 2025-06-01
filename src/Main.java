import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList<>();
        names.add("Anders");
        names.add("Katrine");
        names.add("Joakim");
        names.add("Stine");

        //loading the text file into a string
        try {
        String text = "";

            File file = new File("data/personal_info_list.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                text += sc.nextLine() + "\n";
            }
            sc.close();

            //Instantiating stringhandler to replace text
            StringHandler stringHandler = new StringHandler();
            String newText = stringHandler.replaceText(text, names);
            //Printing the anonymised text
            System.out.println(newText);
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        }

    }
}
