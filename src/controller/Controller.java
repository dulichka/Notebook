package controller;

import model.Notebook;
import model.NotebookDB;
import view.View;

import java.util.Scanner;

/**
 * This class is for handling user actions.
 *
 * @see Notebook
 * @see View
 *
 * @author dulichka
 */

public class Controller {

    private Notebook notebook;
    private View view;

    public Controller(Notebook notebook, View view){
        this.notebook = notebook;
        this.view = view;
    }

    public void processUser(){

        String regex = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? Regex.REGEX_NAME_UKR : Regex.REGEX_NAME_LAT;

        StringBuffer firstName = checkInput(view.FIRST_NAME, regex);
        StringBuffer lastName = checkInput(View.LAST_NAME, regex);
        StringBuffer login = null;
        boolean validLogin = false;
        while (!validLogin){
            try{
                login = checkInput(View.LOGIN_DATA, Regex.REGEX_LOGIN);
                validLogin = NotebookDB.Notes.checkLogin(login);
            } catch (LoginException le){
                System.err.println(le.getMessage());

            }
        }

        notebook.setFirstName(firstName);
        notebook.setLastName(lastName);
        notebook.setLogin(login);

        view.printNoteInfo(View.NOTE_CREATED);

    }

    public StringBuffer checkInput(String field, String regex){
        Scanner sc = new Scanner(System.in);
        String res;
        view.printStringInput(field);
        while( !(sc.hasNext() &&
                (res = sc.next()).matches(regex))) {
            view.printWrongStringInput(field);
        }

        return new StringBuffer().append(res);
    }

    public boolean checkLogin(StringBuffer login){

        return true;
    }
}
