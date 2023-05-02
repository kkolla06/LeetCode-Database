package database;

import entities.*;

import java.io.IOException;

import java.sql.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class DatabaseConnectionHandler {
    private Connection conn;

    public DatabaseConnectionHandler() {
        String host = "localhost";
        String port = "1522";
        String sid = "stu";
        String username = "ora_colis";
        String password = "a25934150";
        String url = "jdbc:oracle:thin:@" + host + ":" + port + ":" + sid;

        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false);
            System.out.println("Connection successful");
            setUpDatabase(conn);
//            conn.close();

        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setUpDatabase(Connection conn) throws IOException, SQLException {
        System.out.println("Setting up database...");
        BufferedReader reader = new BufferedReader(new FileReader("sql/set_up_tables.sql"));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        reader.close();

        String[] sqlStatements = sb.toString().split(";");
        // Removing whitespace and newline characters from each statement
        for (int i = 0; i < sqlStatements.length; i++) {
            sqlStatements[i] = sqlStatements[i].trim();
        }

        // Execute
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select table_name from user_tables");

        Set<String> existingTables = new HashSet<>();

        while(rs.next()) {
            String tableName = rs.getString(1).toLowerCase();
            existingTables.add(tableName);
        }

        for (String sql : sqlStatements) {
            if (!sql.isEmpty()) {
                boolean isCreateTableStatement = sql.toUpperCase().contains("CREATE TABLE");

                if(isCreateTableStatement) {
                    String tableName = sql.split(" ")[2].split("\\(")[0];
                    if(existingTables.contains(tableName.toLowerCase())) {
                        statement.execute("drop table " + tableName + " cascade constraints");
                    }
                }

                System.out.println(sql);
                statement.executeUpdate(sql);
            }
        }
        statement.close();
        rs.close();
        System.out.println("Database set up successfully.");
    }

    public ArrayList<Company> getCompanyTable() throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from Company");

        ArrayList<Company> result = new ArrayList<>();
        while(rs.next()) {
            result.add(new Company(rs.getString(1)));
        }

        return result;
    }

    public ArrayList<Contest> getContestTable() throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from Contest");

        ArrayList<Contest> result = new ArrayList<>();
        while(rs.next()) {
            result.add(new Contest(rs.getInt(1), rs.getString(2)));
        }

        return result;
    }

    public ArrayList<Discussion> getDiscussionTable() throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from Discussion");

        ArrayList<Discussion> result = new ArrayList<>();
        while(rs.next()) {
            result.add(new Discussion(rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getInt(4),
                    rs.getString(5),
                    rs.getInt(6)));
        }

        return result;
    }

    public ArrayList<Member> getMemberTable() throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from Member");

        ArrayList<Member> result = new ArrayList<>();
        while(rs.next()) {
            result.add(new Member(rs.getString(1),
                    rs.getString(2),
                    rs.getString(3)));
        }

        return result;
    }

    public ArrayList<PremiumMember> getPremiumMemberTable() throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from PremiumMember");

        ArrayList<PremiumMember> result = new ArrayList<>();
        while(rs.next()) {
            result.add(new PremiumMember(rs.getString(1),
                                        rs.getString(2)));
        }

        return result;
    }

    public ArrayList<Problem> getProblemTable() throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from Problem");

        ArrayList<Problem> result = new ArrayList<>();
        while(rs.next()) {
            result.add(new Problem(rs.getInt(1),
                                    rs.getString(2),
                                    rs.getFloat(3),
                                    rs.getString(4)));
        }

        return result;
    }
}
