import Universidad.Universidad;
import Universidad.Menu;

public class Main {
    public static void main(String[] args) {
        //Test del programa
        Universidad universidad = new Universidad();
        Menu menu = new Menu();

        menu.mostrarMenu(universidad);
    }
}