package model;

import controller.LoginException;
import javafx.fxml.LoadException;

/**
 * This class is for imitation of notes DB in Notebook.
 *
 * @author dulichka
 */
public class NotebookDB {
    public enum Notes{
        NOTE_ONE("Yuliya", "Davidenko", "yulidavi"),
        NOTE_TWO("Олександр", "Іванов", "alexiva7");

        private String firstName;
        private String lastName;
        private String login;

        Notes(String firstName, String lastName, String login){
            this.firstName = firstName;
            this.lastName = lastName;
            this.login = login;
        }

        public String getLogin() {
            return login;
        }

        public static boolean checkLogin(StringBuffer loginInput) throws LoginException {
            for(Notes note: Notes.values()){
                if(note.getLogin().equals(loginInput.toString())) {
                    throw new LoginException("This login already exists! You can't use this login: "
                            +loginInput+". Please try again.");
                }
            }
            return true;
        }
    }
}
