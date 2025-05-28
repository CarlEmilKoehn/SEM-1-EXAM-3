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
        String text = "";
        File file = new File("doc/personal_info_list.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            text += sc.nextLine() + "\n";
        }
        sc.close();

        StringHandler stringHandler = new StringHandler();
        String newText = stringHandler.replaceText(text, names);

        System.out.println(newText);
    }
}
