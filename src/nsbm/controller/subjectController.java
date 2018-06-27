/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm.controller;

import nsbm.model.subject;
import java.sql.*;
import java.util.*;


/**
 *
 * @author Ravindu
 */
public class subjectController {
    public static int addSubject(subject sub) throws ClassNotFoundException, SQLException {
        String sql = "Insert into subjects values(?,?,?,?,?,?,?,?,?)";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm","root","");
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, sub.getId());
        stm.setObject(6, sub.getName());
        stm.setObject(2, sub.getYear());
        stm.setObject(3, sub.getSemester());
        stm.setObject(4, sub.getAssignments());
        stm.setObject(5, sub.getCost());
        stm.setObject(7, sub.getCredits());
        stm.setObject(8, sub.getType());
        stm.setObject(9, sub.getFacID());
        
        return  stm.executeUpdate();
        
    }
}
