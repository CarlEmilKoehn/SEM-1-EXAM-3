import java.util.ArrayList;

public class StringHandler {

    public StringHandler() {

    }

    public String replaceText(String originalText, ArrayList<String> replacementNames){
        for(String replacement : replacementNames) {
            if (originalText.contains(replacement)) {
                originalText = originalText.replace(replacement, "Den studerende");
            }
        }
        return originalText;
    }

}
