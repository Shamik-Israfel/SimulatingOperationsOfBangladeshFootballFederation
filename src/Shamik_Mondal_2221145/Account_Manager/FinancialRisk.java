/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public class FinancialRisk implements Serializable{
    private String riskName;
    private String description;
    private double probability;
    private double impact;

    public FinancialRisk(String riskName, String description, double probability, double impact) {
        this.riskName = riskName;
        this.description = description;
        this.probability = probability;
        this.impact = impact;
    }

    public String getRiskName() {
        return riskName;
    }

    public String getDescription() {
        return description;
    }

    public double getProbability() {
        return probability;
    }

    public double getImpact() {
        return impact;
    }

    
    
    @Override
    public String toString() {
        return "FinancialRisk{" + "riskName=" + riskName + ", description=" + description + ", probability=" + probability + ", impact=" + impact + '}';
    }
    
}
    
