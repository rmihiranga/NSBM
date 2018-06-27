/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm.controller;


import java.sql.*;
import java.util.*;
import nsbm.model.admin;


/**
 *
 * @author Ravindu
 */
public class loginController {
    
    public static int addAdmin(admin adm) throws ClassNotFoundException, SQLException {
        String sql = "Insert into admin values(?,?,?,?,?,?)";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm","root","");
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, adm.getUsername());
        stm.setObject(2, adm.getPassword());
        stm.setObject(3, adm.getFullName());
        stm.setObject(5, adm.getNIC());
        stm.setObject(4, adm.getFaculty());
        stm.setObject(6, adm.getIsSuper());
        
        
        return  stm.executeUpdate();
        
    }
    
}
