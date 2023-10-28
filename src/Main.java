import Universidad.Universidad;
import Universidad.Menu;

public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        Menu menu = new Menu();

        menu.mostrarMenu(universidad);
    }
}