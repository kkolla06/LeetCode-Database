import database.DatabaseConnectionHandler;
import ui.MainGui;

public class main {
    public static void main(String[] args) {
        DatabaseConnectionHandler dbHandler = new DatabaseConnectionHandler();

        MainGui mainGui = new MainGui(dbHandler);

    }
}