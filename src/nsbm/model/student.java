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
public class student {
    private String id;
    private String name;
    private String bday;
    private String NIC;
    private String gender;
    private String address;
    private String telephone;
    private String email;
    
    public student(){
    }
    
    public student(String id,String name,String bday, String NIC,String gender,String address,String telephone, String email ){
        this.id = id;
        this.name = name;
        this.bday = bday;
        this.NIC = NIC;
        this.gender = gender;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }
    
    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    


   
   
}
