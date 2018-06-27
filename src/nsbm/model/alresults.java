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
public class alresults {
    private String id;
    private String year;
    private String sub1name;
    private String sub2name;
    private String sub3name;
    private String sub4name;
    private String sub1grade;
    private String sub2grade;
    private String sub3grade;
    private String sub4grade;
    private String zscore;
    private String rank;
    
    
    public alresults(){
    }
    
    public alresults(String id, String year,String sub1name,String sub2name,String sub3name, String sub4name,String sub1grade,String sub2grade,String sub3grade,String sub4grade, String zscore,String rank ){
        this.id = id;
        this.zscore = zscore;
        this.rank = rank;
        this.year = year;
        this.sub1name = sub1name;
        this.sub2name = sub2name;
        this.sub3name = sub3name;
        this.sub4name = sub4name;
        this.sub1grade = sub1grade;
        this.sub2grade = sub2grade;
        this.sub3grade = sub3grade;
        this.sub4grade = sub4grade;
        
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getZscore() {
        return zscore;
    }

    public void setZscore(String zscore) {
        this.zscore = zscore;
    }
    
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    public String getSub1name() {
        return sub1name;
    }

    public void setSub1name(String sub1name) {
        this.sub1name = sub1name;
    }
    
    public String getSub2name() {
        return sub2name;
    }

    public void setSub2name(String sub2name) {
        this.sub2name = sub2name;
    }
    
    public String getSub3name() {
        return sub3name;
    }

    public void setSub3name(String sub3name) {
        this.sub3name = sub3name;
    }
    
    public String getSub4name() {
        return sub4name;
    }

    public void setSub4name(String sub4name) {
        this.sub4name = sub4name;
    }
    
    public String getSub1grade() {
        return sub1grade;
    }

    public void setSub1grade(String sub1grade) {
        this.sub1grade = sub1grade;
    }
    
    public String getSub2grade() {
        return sub2grade;
    }

    public void setSub2grade(String sub2grade) {
        this.sub2grade = sub2grade;
    }
    
    public String getSub3grade() {
        return sub3grade;
    }

    public void setSub3grade(String sub3grade) {
        this.sub3grade = sub3grade;
    }
    
    public String getSub4grade() {
        return sub4grade;
    }

    public void setSub4grade(String sub4grade) {
        this.sub4grade = sub4grade;
    }
}
