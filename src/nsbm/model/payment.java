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
public class payment {
    
    private String id;
    private String year;
    private String sem;
    private String date;
    private String amount;
    
    
    public payment(){
    }
    
    public payment(String id,String year, String sem,String date,String amount){
        
        this.id = id;
        this.year = year;
        this.sem = sem;
        this.date = date;
        this.amount = amount;
        
    }
    
    
    
    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }
    
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    


   
   
}
