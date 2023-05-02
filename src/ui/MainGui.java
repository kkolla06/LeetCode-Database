package ui;

import database.DatabaseConnectionHandler;

import javax.swing.*;

public class MainGui extends JFrame {

    public MainGui(DatabaseConnectionHandler dbHandler) {
        setTitle("CPSC 304 Leetcode Database");
        JPanel viewAndEditDatabaseTab = new ViewAndEditDatabaseTab(dbHandler);
        JScrollPane viewAndEditDatabasePane = new JScrollPane(viewAndEditDatabaseTab);

        JPanel getAllTab = new GetAllTab();

        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(0,0,1500,1500);

        tp.add("View and Edit Database",viewAndEditDatabasePane);
        tp.add("Get all data of a certain type",getAllTab);

        add(tp);

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setVisible(true);
    }

}
