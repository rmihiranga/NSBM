/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import nsbm.model.payment;

/**
 *
 * @author Ravindu
 */
public class paymentController {
    public static int payment(payment pay) throws ClassNotFoundException, SQLException {
        String sql = "Insert semesterenrollment values(?,?,?,?,?)";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm","root","");
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, pay.getID());
        stm.setObject(2, pay.getYear());
        stm.setObject(3, pay.getSem());
        stm.setObject(4, pay.getDate());
        stm.setObject(5, pay.getAmount());
        
        
        return  stm.executeUpdate();
        
    }
}
