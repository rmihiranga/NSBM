/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm.controller;

/**
 *
 * @author Ravindu
 */
import java.sql.*;
import java.util.*;
import nsbm.model.lecturer;


public class lecturerController {
   
    
    public static int addLecturer(lecturer lec) throws ClassNotFoundException, SQLException {
        String sql = "Insert into lecturer values(?,?,?,?)";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm","root","");
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, lec.getId());
        stm.setObject(2, lec.getName());
        stm.setObject(3, lec.getEmail());
        stm.setObject(4, lec.getFaculty());
        
        
        return  stm.executeUpdate();
        
    }
}
