package org.example;

/*
Create a Performance class. This is just a model class.
§ String performanceID – Stores the ID for the performance. This ID must be unique.
§ String performanceName – Stores the name of the performance.
§ String performanceLeadName – Stores the name of the lead of the performance group
§ String
§ Create the necessary constructor, getters and setters, and toString() method.
 */

public class Performance {
    private String performanceID;
    private String performanceName;
    private String performanceLeadName;

    public Performance() {
    }

    public Performance(String performanceID, String performanceName, String performanceLeadName) {
        this.performanceID = performanceID;
        this.performanceName = performanceName;
        this.performanceLeadName = performanceLeadName;
    }

    public String getPerformanceID() {
        return performanceID;
    }

    public void setPerformanceID(String performanceID) {
        this.performanceID = performanceID;
    }

    public String getPerformanceName() {
        return performanceName;
    }

    public void setPerformanceName(String performanceName) {
        this.performanceName = performanceName;
    }

    public String getPerformanceLeadName() {
        return performanceLeadName;
    }

    public void setPerformanceLeadName(String performanceLeadName) {
        this.performanceLeadName = performanceLeadName;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "performanceID='" + performanceID + '\'' +
                ", performanceName='" + performanceName + '\'' +
                ", performanceLeadName='" + performanceLeadName + '\'' +
                '}';
    }
}
