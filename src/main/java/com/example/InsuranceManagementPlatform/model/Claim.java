package com.example.InsuranceManagementPlatform.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "claim_details")
public class Claim {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="claim_Number")
    private long claimNumber;

    @Column
    private String description;

    @Column
    private String claimDate;

    @Column
    private String claimStatus;

    public long getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(long claimNumber) {
        this.claimNumber = claimNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(String claimDate) {
        this.claimDate = claimDate;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "claimNumber=" + claimNumber +
                ", description='" + description + '\'' +
                ", claimDate='" + claimDate + '\'' +
                ", claimStatus='" + claimStatus + '\'' +
                '}';
    }
}
