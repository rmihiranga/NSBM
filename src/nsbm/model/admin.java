/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm.model;

/**
 *
 * @author Ravindu
 */
public class admin {
    private String username;
    private String password;
    private String fullName;
    private String faculty;
    private String NIC;
    private boolean isSuper;


    public admin(){
        
    }
    
    public admin(String username, String password, String fullName, String faculty, String NIC,boolean isSuper){
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.faculty = faculty;
        this.NIC = NIC;
        this.isSuper = isSuper;
                
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    
    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }
    
    public boolean getIsSuper() {
        return isSuper;
    }

    public void setIsSuper(boolean isSuper) {
        this.isSuper = isSuper;
    }

    
    

}


