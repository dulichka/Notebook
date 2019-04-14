package model;

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

        public static boolean checkLogin(StringBuffer loginInput){
            for(Notes note: Notes.values()){
                if(note.getLogin().equals(loginInput.toString())) {
                    return true;
                }
            }
            return false;
        }
    }
}
