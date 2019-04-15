package model;

/**
 * This class is used for data used in the Controller.
 *
 * @author dulichka
 */

public class Notebook {

    private StringBuffer firstName;
    private StringBuffer lastName;
    private StringBuffer login;

    public void setFirstName(StringBuffer firstName) {
        this.firstName = firstName;
    }

    public StringBuffer getFirstName(){
        return firstName;
    }

    public void setLastName(StringBuffer lastName) {
        this.lastName = lastName;
    }

    public StringBuffer getLastName() {
        return lastName;
    }

    public StringBuffer getLogin() {
        return login;
    }

    public void setLogin(StringBuffer login){
        this.login = login;
    }
}
