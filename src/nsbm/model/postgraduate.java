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
public class postgraduate {
    private String id;
    private String qualType;
    private String preIns;
    private String yearComplete;
    
    
    
    public postgraduate(){
    }
    
    public postgraduate(String id,String qualType,String preIns, String yearComplete ){
        this.id = id;
        this.qualType = qualType;
        this.preIns = preIns;
        this.yearComplete = yearComplete;
        
        
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getQualType() {
        return qualType;
    }

    public void setQualType(String qualType) {
        this.qualType = qualType;
    }
    
    public String getPreIns() {
        return preIns;
    }

    public void setPreIns(String preIns) {
        this.preIns = preIns;
    }
    
    public String getYearComplete() {
        return yearComplete;
    }

    public void setYear(String yearComplete) {
        this.yearComplete = yearComplete;
    }
    
    
}

