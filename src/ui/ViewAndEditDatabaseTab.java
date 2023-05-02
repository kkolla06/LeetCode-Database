package ui;

import database.DatabaseConnectionHandler;
import entities.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViewAndEditDatabaseTab extends JPanel {

    DatabaseConnectionHandler dbHandler;
    JTable entityTable;

    public ViewAndEditDatabaseTab(DatabaseConnectionHandler dbHandler) {
        this.dbHandler = dbHandler;


        renderContestTable();
        renderDiscussionTable();
        renderCompanyTable();
        renderMemberTable();
        renderPremiumMemberTable();
        renderProblemTable();
    }



    public void renderCompanyTable() {
        ArrayList<Company> sqlCompanyData;
        try {
            sqlCompanyData = dbHandler.getCompanyTable();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String[] cols = {"Name"};
        DefaultTableModel tableModel = new DefaultTableModel(cols, 0);
        entityTable = new JTable(tableModel);
        for(Company company : sqlCompanyData) {
            Object[] data = {company.getName()};
            tableModel.addRow(data);
        }
        JScrollPane entityPane = new JScrollPane(entityTable);
        entityPane.setBorder(BorderFactory.createTitledBorder ("Company"));
        this.add(entityPane);
    }

    private void renderContestTable() {
        ArrayList<Contest> sqlContestData;
        try {
            sqlContestData = dbHandler.getContestTable();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String[] cols = {"Number", "Status"};
        DefaultTableModel tableModel = new DefaultTableModel(cols, 0);
        entityTable = new JTable(tableModel);
        for(Contest contest : sqlContestData) {
            Object[] data = {contest.getNumber(), contest.getStatus()};
            tableModel.addRow(data);
        }
        JScrollPane entityPane = new JScrollPane(entityTable);
        entityPane.setBorder(BorderFactory.createTitledBorder ("Contest"));
        this.add(entityPane);
    }

    private void renderDiscussionTable() {
        ArrayList<Discussion> sqlDiscussionData;
        try {
            sqlDiscussionData = dbHandler.getDiscussionTable();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String[] cols = {"ID", "Submission Time", "Upvotes", "Viewsnum", "MemberUsername", "Problem Number"};
        DefaultTableModel tableModel = new DefaultTableModel(cols, 0);
        entityTable = new JTable(tableModel);
        for(Discussion discussion : sqlDiscussionData) {
            Object[] data = {discussion.getDiscussionId(),
                    discussion.getSubmissionTime(),
                    discussion.getUpvotes(),
                    discussion.getViewsNum(),
                    discussion.getMemberUsername(),
                    discussion.getProblemNum()};
            tableModel.addRow(data);
        }
        JScrollPane entityPane = new JScrollPane(entityTable);
        entityPane.setBorder(BorderFactory.createTitledBorder ("Discussion"));
        this.add(entityPane);
    }


    private void renderMemberTable() {
        ArrayList<Member> sqlMemberData;
        try {
            sqlMemberData = dbHandler.getMemberTable();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String[] cols = {"Username", "Email", "Password"};
        DefaultTableModel tableModel = new DefaultTableModel(cols, 0);
        entityTable = new JTable(tableModel);
        for(Member member : sqlMemberData) {
            Object[] data = {member.getUsername(),
                    member.getEmail(),
                    member.getPassword()};
            tableModel.addRow(data);
        }
        JScrollPane entityPane = new JScrollPane(entityTable);
        entityPane.setBorder(BorderFactory.createTitledBorder ("Member"));
        this.add(entityPane);
    }

    private void renderPremiumMemberTable() {
        ArrayList<PremiumMember> sqlPremiumMemberData;
        try {
            sqlPremiumMemberData = dbHandler.getPremiumMemberTable();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String[] cols = {"Username", "Credit Card Number"};
        DefaultTableModel tableModel = new DefaultTableModel(cols, 0);
        entityTable = new JTable(tableModel);
        for(PremiumMember premiumMember : sqlPremiumMemberData) {
            Object[] data = {premiumMember.getUsername(),
                    premiumMember.getCreditCardNumber()};
            tableModel.addRow(data);
        }
        JScrollPane entityPane = new JScrollPane(entityTable);
        entityPane.setBorder(BorderFactory.createTitledBorder ("Premium Member"));
        this.add(entityPane);
    }

    private void renderProblemTable() {
        ArrayList<Problem> sqlProblemData;
        try {
            sqlProblemData = dbHandler.getProblemTable();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String[] cols = {"Problem", "Title", "Acceptance", "Difficulty"};
        DefaultTableModel tableModel = new DefaultTableModel(cols, 0);
        entityTable = new JTable(tableModel);
        for(Problem problem : sqlProblemData) {
            Object[] data = {problem.getProblemNum(),
                    problem.getTitle(),
                    problem.getAcceptance(),
                    problem.getDifficulty(),

            };
            tableModel.addRow(data);
        }
        JScrollPane entityPane = new JScrollPane(entityTable);
        entityPane.setBorder(BorderFactory.createTitledBorder ("Problem"));
        this.add(entityPane);
    }
}
