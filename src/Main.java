import controller.Controller;
import model.Notebook;
import view.View;

/** This the launching class.
 *
 * @author Oleksandra Dulich
 */

public class Main {

    public static void main(String[] args){

        Controller controller = new Controller(new Notebook(), new View());
        controller.processUser();
    }
}
