/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm.controller;

import nsbm.model.updatedStudent;
import nsbm.model.student;
import nsbm.model.alresults;
import nsbm.model.postgraduate;
import java.sql.*;
import java.util.*;


/**
 *
 * @author Ravindu
 */
public class studentController {
    
    public static int addStudent(student stdnt) throws ClassNotFoundException, SQLException {
        String sql = "Insert into student values(?,?,?,?,?,?,?,?)";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm","root","");
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, stdnt.getId());
        stm.setObject(2, stdnt.getName());
        stm.setObject(8, stdnt.getBday());
        stm.setObject(3, stdnt.getNIC());
        stm.setObject(4, stdnt.getGender());
        stm.setObject(5, stdnt.getAddress());
        stm.setObject(6, stdnt.getTelephone());
        stm.setObject(7, stdnt.getEmail());
        
        return  stm.executeUpdate();
        
    }
    
    
    
    public static int viewStudent(String id) throws ClassNotFoundException, SQLException {
        
        String sql = "Select * from student where StudentID = ?";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm","root","");
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rs = stm.executeQuery();
        while(rs.next()){
            String name = rs.getString("StudentName");
            String nic = rs.getString("Nic");
            String gender = rs.getString("Gender");
            String address = rs.getString("Address");
            String tp = rs.getString("Telephone");
            String email = rs.getString("Email");
            String bday = rs.getString("bday");
        }
        
        return  stm.executeUpdate();
    }
    
    public static int alresult(alresults al) throws ClassNotFoundException, SQLException {
        String sql = "Insert into alresults values(?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm","root","");
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, al.getId());
        stm.setObject(2, al.getYear());
        stm.setObject(3, al.getSub1name());
        stm.setObject(4, al.getSub2name());
        stm.setObject(5, al.getSub3name());
        stm.setObject(6, al.getSub4name());
        stm.setObject(7, al.getSub1grade());
        stm.setObject(8, al.getSub2grade());
        stm.setObject(9, al.getSub3grade());
        stm.setObject(10, al.getSub4grade());
        stm.setObject(11, al.getZscore());
        stm.setObject(12, al.getRank());
        
        
        return  stm.executeUpdate();
        
    }
    
    public static int masters(postgraduate mas) throws ClassNotFoundException, SQLException {
        String sql = "Insert into masters values(?,?,?,?)";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm","root","");
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, mas.getId());
        stm.setObject(2, mas.getQualType());
        stm.setObject(3, mas.getPreIns());
        stm.setObject(4, mas.getYearComplete());
        
        
        
        return  stm.executeUpdate();
        
    }
    
    public static int updateStudent(updatedStudent stdnt) throws ClassNotFoundException, SQLException {
        String sql = "update student set StudentName = ?,Nic=?,Gender=?,Address=?,Telephone=?,Email=?,bday=?";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm","root","");
        PreparedStatement stm = conn.prepareStatement(sql);
        
        stm.setObject(1, stdnt.getName());
        stm.setObject(7, stdnt.getBday());
        stm.setObject(2, stdnt.getNIC());
        stm.setObject(3, stdnt.getGender());
        stm.setObject(4, stdnt.getAddress());
        stm.setObject(5, stdnt.getTelephone());
        stm.setObject(6, stdnt.getEmail());
        
        return  stm.executeUpdate();
        
    }
}
