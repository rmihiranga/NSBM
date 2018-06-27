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
public class subject {
    private String id;
    private String name;
    private String year;
    private String semester;
    private String assignments;
    private String cost;
    private String credits;
    private String type;
    private String facID;
    
    public subject(){
    }
    
    public subject(String id,String name,String year, String semester,String assignments,String cost,String credits, String type, String facID ){
        this.id = id;
        this.name = name;
        this.year = year;
        this.semester = semester;
        this.assignments = assignments;
        this.cost = cost;
        this.credits = credits;
        this.type = type;
        this.facID = facID;
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
    
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    public String getAssignments() {
        return assignments;
    }

    public void setAssignments(String assignments) {
        this.assignments = assignments;
    }
    
    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
    
    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getFacID() {
        return facID;
    }

    public void setFacID(String facID) {
        this.facID = facID;
    }
    
    


   
   
}
