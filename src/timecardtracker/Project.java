/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecardtracker;

/**
 *
 * @author Patsf
 */
public class Project {
    private int id;
    private String startDate;
    private String description;
    private String endDate;
    private int employeeID;

    public Project(int id, String startDate, String endDate, String description, int employeeID) {
        this.id = id;
        this.startDate = startDate;
        this.description = description;
        this.endDate = endDate;
        this.employeeID = employeeID;
    }
    
    public int getID() {
        return id;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    public int getEmployeeID() {
        return id;
    }
    
    public void setEmployeeID(int employeeID) {
        this.id = employeeID;
    }
}
