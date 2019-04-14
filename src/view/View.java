package view;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * This class is for console output.
 *
 * @author Oleksandra Dulich
 */

public class View {

    private static String INPUT_STRING_DATA = "input.string.data";
    private static String FIRST_NAME = "input.first.name.data";
    private static String LAST_NAME = "input.last.name.data";
    private static String WRONG_INPUT_DATA = "input.wrong.data";
    private static String LOGIN_DATA = "input.login.data";
    private static String NOTE_CREATED = "note.created.data";

    private static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("ua"));

    private void printMessage(String message){
        System.out.println(message);
    }

    private String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printNoteInfo(String message) {
        printMessage(bundle.getString(message));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }
}
