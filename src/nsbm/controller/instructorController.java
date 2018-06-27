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
import nsbm.model.instructor;


public class instructorController {
   
    
    public static int addInstructor(instructor ins) throws ClassNotFoundException, SQLException {
        String sql = "Insert into instructor values(?,?,?,?)";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm","root","");
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, ins.getId());
        stm.setObject(2, ins.getName());
        stm.setObject(3, ins.getEmail());
        stm.setObject(4, ins.getFaculty());
        
        
        return  stm.executeUpdate();
        
    }
}
